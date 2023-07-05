/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException; //for validation of the csv file
import java.text.DecimalFormat; //for formatting of decimal values

public class EmployeeAttendance {
    private static final DecimalFormat df = new DecimalFormat("0.00"); //used to convert values of totalHours and payrollSalary into two decimal places
    
    //Attributes
    private String _totalHoursWorked;
    private String _grossMonthlySalary;
    private String _netMonthlySalary;
    private String _sssDeduction;
    private String _phealthDeduction;
    private String _pagibigDeduction;
    private String _totalDeduction;
    private String _taxableIncome;
    private String _withholdingTax;
    private String _totalAllowance;

    //Getter Method
    public String GetTotalHours() {
        return _totalHoursWorked;
    }

    public String GetPayrollSalary() {
        return _grossMonthlySalary;
    }

    public String GetNetMonthlySalary() {
        return _netMonthlySalary;
    }
    public String GetSSSDeduction() {
        return _sssDeduction;
    }
    public String GetPhealthDeduction() {
        return _phealthDeduction;
    }
    public String GetPagibigDeduction() {
        return _pagibigDeduction;
    }
    public String GetTotalDeduction() {
        return _totalDeduction;
    }
    public String GetTaxableIncome() {
        return _taxableIncome;
    }
    public String GetWithholdingTax() {
        return _withholdingTax;
    }
    public String GetTotalAllowance() {
        return _totalAllowance;
    }

    //Method to load data from CSV file to default table model
    public DefaultTableModel GetEmployeeAttendance(String EmployeeNo, String Month) throws FileNotFoundException, IOException, CsvValidationException {
        DefaultTableModel _employeeAttendance;
        String CSVFilename = "EmployeeAttendance.csv";
        CSVReader reader = new CSVReader(new FileReader(CSVFilename));
        String[] header = reader.readNext();
        _employeeAttendance = new DefaultTableModel(header, 0);

        String[] line;
        double totalHoursWorked = 0;
        double grossMonthlySalary = 0;
        double netwage = 0.0;
        double totalAllowance = 0;

        // Read each line of the CSV file
        while ((line = reader.readNext()) != null) {
            // Check if the employee number and month match
            if (line[0].equals(EmployeeNo) && line[1].equals(Month)) {
                _employeeAttendance.addRow(line);
                double hoursWorked = Double.parseDouble(line[5]);
                double hourlyRate = Double.parseDouble(line[6]);
                double riceSubsidy = Double.parseDouble(line[7]);
                double phoneAllowance = Double.parseDouble(line[8]);
                double clothingAllowance = Double.parseDouble(line[9]);

                // Accumulate the total hours worked and gross monthly salary
                totalHoursWorked += hoursWorked - 1; // -1 hour to account for breaktime
                grossMonthlySalary += (hoursWorked - 1) * hourlyRate;
                totalAllowance += riceSubsidy + phoneAllowance + clothingAllowance;
        
            }
        }

        double sssdeduction = 0;
        double phealth = 0;
        double pagibig = 0;
        double withtax = 0;

        // Compute deductions based on gross monthly salary
        if (grossMonthlySalary >= 24750) {
            sssdeduction = 1125;
            phealth = (grossMonthlySalary * 0.03) * 0.5;
            pagibig = 100;
        } else if (grossMonthlySalary < 24750) {
            sssdeduction = grossMonthlySalary / 22.4691;
            phealth = (grossMonthlySalary * 0.03) * 0.5;
            pagibig = 100;
        }

        double totdeduction = sssdeduction + phealth + pagibig;
        double taxincome = grossMonthlySalary - totdeduction;

        // Compute net monthly wage based on tax income
        if (taxincome >= 33333) {
            withtax = (taxincome - 33333.00) * 0.25 + 2500.00;
            netwage = (taxincome - withtax)+ totalAllowance;
        } else if (taxincome < 33333) {
            withtax = (taxincome - 20833.00) * 0.20;
            netwage = (taxincome - withtax) + totalAllowance;
        }
        
        

        // Format the computed values to two decimal places
        _totalHoursWorked = df.format(totalHoursWorked); //formatted total hours worked into 2 decimal places
        _grossMonthlySalary = df.format(grossMonthlySalary); //formatted gross monthly salary into 2 decimal places
        _netMonthlySalary = df.format(netwage); //formatted Net Monthly Salary into 2 decimal places
        _sssDeduction = df.format(sssdeduction); //formatted SSS deduction into 2 decimal places
        _phealthDeduction = df.format(phealth); //formatted Philhealth deduction into 2 decimal places
        _pagibigDeduction = df.format(pagibig); //formatted Pagibig deduction into 2 decimal places
        _totalDeduction = df.format(totdeduction); //formatted Total deduction into 2 decimal places
        _taxableIncome = df.format(taxincome); //formatted Taxable income into 2 decimal places
        _withholdingTax = df.format(withtax); //formatted Withholding Tax into 2 decimal places
        _totalAllowance = df.format(totalAllowance); //formatted Total Allowance into 2 decimal places

        return _employeeAttendance; // return empty table if no matching records found
    }
}
