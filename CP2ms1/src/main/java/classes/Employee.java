/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package classes;

/**
 *
 * @author DREAM PC
 */

/**
 * IMPORT CLASSES
 * This section contains the external classes used to Create, Read, Update and Delete Employee Records
 */

import java.io.FileWriter;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Employee {
    
    //Attributes
    private String _employeeNo;
    private String _lastName;
    private String _firstName;
    private String _sssNo;
    private String _phealthNo;
    private String _tinNo;
    private String _pagibigNo;
    private String _birthday;
    private String _address;
    private String _phoneNumber;
    private String _status;
    private String _position;
    private String _immediateSup;
    private String _riceSubsidy;
    private String _phoneAllowance;
    private String _clothingAllowance;
    private String _basicSalary;
    private String _hourlyRate;
    private int _sickLeave;
    private int _vacationLeave;
    private int _emergencyLeave;
    private String _grossSemiMonthlyRate;
    
    //GETTER METHODS
    public String GetEmployeeNo(){
        return _employeeNo;
    } 
    public String GetLastName(){
        return _lastName;
    } 
    public String GetFirstName(){
        return _firstName;
    } 
    public String GetSSSNo(){
        return _sssNo;
    } 
    public String GetPhealthNo(){
        return _phealthNo;
    } 
    public String GetTinNo(){
        return _tinNo;
    } 
    public String GetPagibigNo(){
        return _pagibigNo;
    } 
    public String GetBirthday(){
        return _birthday;
    } 
    public String GetAddress(){
        return _address;
    } 
    public String GetPhoneNumber(){
        return _phoneNumber;
    } 
    public String GetStatus(){
        return _status;
    } 
    public String GetPosition(){
        return _position;
    } 
    public String GetImmediateSup(){
        return _immediateSup;
    } 
    public String GetRiceSubsidy(){
        return _riceSubsidy;
    } 
    public String GetPhoneAllowance(){
        return _phoneAllowance;
    } 
    public String GetClothingAllowance(){
        return _clothingAllowance;
    } 
    public String GetBasicSalary(){
        return _basicSalary;
    } 
    public String GetHourlyRate(){
        return _hourlyRate;
    } 
    public int GetSickLeave(){
        return _sickLeave;
    } 
    public int GetVacationLeave(){
        return _vacationLeave;
    } 
    public int GetEmergencyLeave(){
        return _emergencyLeave;
    } 
     public String GetGrossSemiMonthlyRate(){
        return _grossSemiMonthlyRate;
    } 
    
    //SETTER METHODS
    public void SetEmployeeNo(String EmployeeNo) {
        _employeeNo = EmployeeNo;
        }
    public void SetLastName(String LastName) {
        _lastName = LastName;
        }
    public void SetFirstName(String FirstName) {
        _firstName = FirstName;
        }
    public void SetSSSNo(String SSSNo) {
        _sssNo = SSSNo;
        }
    public void SetPhealthNo(String PhealthNo) {
        _phealthNo = PhealthNo;
        }
    public void SetTinNo(String TinNo) {
        _tinNo = TinNo;
        }
    public void SetPagibigNo(String PagibigNo) {
        _pagibigNo = PagibigNo;
        }
    public void SetBirthday(String Birthday) {
        _birthday = Birthday;
        }
    public void SetAddress(String Address) {
        _address = Address;
        }
    public void SetPhoneNumber(String PhoneNumber) {
        _phoneNumber = PhoneNumber;
        }
    public void SetStatus(String Status) {
        _status = Status;
        }
    public void SetPosition(String Position) {
        _position = Position;
        }
    public void SetImmediateSup(String ImmediateSup) {
        _immediateSup = ImmediateSup;
        }
    public void SetRiceSubsidy(String RiceSubsidy) {
        _riceSubsidy = RiceSubsidy;
        }
    public void SetPhoneAllowance(String PhoneAllowance) {
        _phoneAllowance = PhoneAllowance;
        }
    public void SetClothingAllowance(String ClothingAllowance) {
        _clothingAllowance = ClothingAllowance;
        }
    public void SetBasicSalary(String BasicSalary) {
        _basicSalary = BasicSalary;
        }
    public void SetHourlyRate(String HourlyRate) {
        _hourlyRate = HourlyRate;
        }
    public void SetSickLeave(int SickLeave) {
        _sickLeave = SickLeave;
        }
    public void SetVacationLeave(int VacationLeave) {
        _vacationLeave = VacationLeave;
        }
    public void SetEmergencyLeave(int EmergencyLeave) {
        _emergencyLeave = EmergencyLeave;
        }
    public void SetGrossSemiMonthlyRate(String GrossSemiMonthlyRate) {
        _grossSemiMonthlyRate = GrossSemiMonthlyRate;
        }
    //Method for creating Employee File; this works when 'Employees.csv' does not exist
    public void CreateEmployeeFile(String CSVFilename) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] headers = new String [19];
            headers[0] = "Employee #";
            headers[1] = "Last Name";
            headers[2] = "First Name";
            headers[3] = "Birthday";
            headers[4] = "Address";
            headers[5] = "Phone Number";
            headers[6] = "SSS #";
            headers[7] = "Philhealth #";
            headers[8] = "TIN #";
            headers[9] = "Pagibig #";
            headers[10] = "Status";
            headers[11] = "Position";
            headers[12] = "Immediate Supervisor";
            headers[13] = "Basic Salary";
            headers[14] = "Rice Subsidy";
            headers[15] = "Phone Allowance";
            headers[16] = "Clothing Allowance";
            headers[17] = "Gross Semi-monthly Rate";
            headers[18] = "Hourly Rate";
            writer.writeNext(headers);
        }
    }
    
    //Method for adding or writing employee record in the csv file
    public void AddEmployee(String CSVFilename) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(CSVFilename, true))) {
            String[] employeeRecord = new String[19];
            employeeRecord[0] = _employeeNo;
            employeeRecord[1] = _lastName;
            employeeRecord[2] = _firstName;
            employeeRecord[3] = _birthday;
            employeeRecord[4] = _address;
            employeeRecord[5] = _phoneNumber;
            employeeRecord[6] = _sssNo;
            employeeRecord[7] = _phealthNo;
            employeeRecord[8] = _tinNo;
            employeeRecord[9] = _pagibigNo;
            employeeRecord[10] = _status;
            employeeRecord[11] = _position;
            employeeRecord[12] = _immediateSup;
            employeeRecord[13] = _basicSalary;
            employeeRecord[14] = _riceSubsidy;
            employeeRecord[15] = _phoneAllowance;
            employeeRecord[16] = _clothingAllowance;
            employeeRecord[17] = _grossSemiMonthlyRate;
            employeeRecord[18] = _hourlyRate;
            writer.writeNext(employeeRecord);
        }
    }
    
    //Method for fetching Employee records from the CSV file to a default table model
     public TableModel FetchEmployees(String csvFilename) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(csvFilename));
            String[] headers = reader.readNext();
            String[] tableHeaders = new String[]{headers[0], headers[1], headers[2], headers[6], headers[7], headers[8], headers[9]};
            DefaultTableModel employeeRecords = new DefaultTableModel(tableHeaders, 0);
            String[] line;
            while ((line = reader.readNext()) != null) {
                Object[] rowData = new Object[]{
                        line[0],
                        line[1],
                        line[2],
                        line[6],
                        line[7],
                        line[8],
                        line[9]
                };
                employeeRecords.addRow(rowData);
            }
            return employeeRecords;
}
     
     //Method for Viewing Employee Records
     public Employee GetEmployeeRecords(String EmployeeNo) throws FileNotFoundException, IOException, CsvValidationException{
        String fileName = "Employees.csv";
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] header = reader.readNext();
        String[] employee;
        while((employee = reader.readNext()) != null){
            if(employee[0].equals(EmployeeNo)){
                this._employeeNo = employee[0];
                _lastName = employee[1];
                _firstName = employee[2];
                _birthday = employee[3];
                _address = employee[4];
                _phoneNumber = employee[5];
                _sssNo = employee[6];
                _phealthNo = employee[7];
                _tinNo = employee[8];
                _pagibigNo = employee[9];
                _status = employee[10];
                _position = employee[11];
                _immediateSup = employee[12];
                _basicSalary = employee[13];
                _riceSubsidy = employee[14];
                _phoneAllowance = employee[15];
                _clothingAllowance = employee[16];
                _grossSemiMonthlyRate = employee[17];
                _hourlyRate = employee[18]; 
                break;
            }
        }
        return this;
    }
    
    //Method for Editing Employee Records
    public void EditEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv",".tmp"); //from csv to tmp
        CSVReader reader = new CSVReader(new FileReader(CSVFilename)); //for the reader, the file that will be accessed would be Employees.csv
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))) { //for the writer, the file that will be created would be Employees.tmp
            while((line = reader.readNext()) !=null) {
                if(line[0].equals(_employeeNo)) {
                    line[0] = _employeeNo;
                    line[1] = _lastName;
                    line[2] = _firstName;
                    line[3] = _birthday;
                    line[4] = _address;
                    line[5] = _phoneNumber;
                    line[6] = _sssNo;
                    line[7] = _phealthNo;
                    line[8] = _tinNo;
                    line[9] = _pagibigNo;
                    line[10] = _status;
                    line[11] = _position;
                    line[12] = _immediateSup;
                    line[13] = _basicSalary;
                    line[14] = _riceSubsidy;
                    line[15] = _phoneAllowance;
                    line[16] = _clothingAllowance;
                    line[17] = _grossSemiMonthlyRate;
                    line[18] = _hourlyRate;
                }
                writer.writeNext(line);
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }
    }
    
    //Method for Deleting Employee Record
    public void DeleteEmployee(String CSVFilename) throws FileNotFoundException, IOException, CsvValidationException {
        String tempFilename = CSVFilename.replace(".csv",".tmp"); //from csv to tmp
        CSVReader reader = new CSVReader(new FileReader(CSVFilename)); //for the reader, the file that will be accessed would be Employees.csv
        String[] line;
        try(CSVWriter writer = new CSVWriter(new FileWriter(tempFilename, true))) { //for the writer, the file that will be created would be Employees.tmp
            while((line = reader.readNext()) !=null) {
                if(!line[0].equals(_employeeNo)) {
                    writer.writeNext(line);
                }
            }
            reader.close();
        } finally {
            new File(CSVFilename).delete();
            new File(tempFilename).renameTo(new File(CSVFilename));
        }

    }}