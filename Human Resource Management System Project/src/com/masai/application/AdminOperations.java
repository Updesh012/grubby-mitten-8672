package com.masai.application;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.checkdetails.Check;
import com.masai.dao.AdminDaoImpl;
import com.masai.usecases.AddDepartment;
import com.masai.usecases.Addemployee;
import com.masai.usecases.GetAllDepartments;
import com.masai.usecases.GetAllEmployee;
import com.masai.usecases.GetAllLeaves;
import com.masai.usecases.LeaveRespond;
import com.masai.usecases.TransferEmployee;
import com.masai.usecases.UpdateAdminProfile;
import com.masai.usecases.UpdateDepartment;
import com.masai.usecases.UpdateEmpProfile;

public class AdminOperations {
	
	String pass;
	String email;
	
	public AdminOperations() {
	
	}

	public AdminOperations(String pass, String email) {
		super();
		this.pass = pass;
		this.email = email;
	}
	
	public void adminOper() {
		
		int choice = Integer.parseInt(Check.checkChoicesForAdmin());
		
		switch (choice) {
		case 1: {
			UpdateAdminProfile uaf = new UpdateAdminProfile(pass, email);
			uaf.updateProfile();
			adminOper();
			break;
		}
		case 2:{
			Addemployee ae = new Addemployee();
			ae.addemp();
			adminOper();
			break;
		}
		case 3:{
			TransferEmployee te = new TransferEmployee();
			te.transferEmp();
			adminOper();
			break;
		}
		case 4:{
			GetAllEmployee gae = new GetAllEmployee();
			gae.allEmp();
			adminOper();
			break;
		}
		case 5:{
			AddDepartment ad = new AddDepartment();
			ad.addDepartment();
			adminOper();
			break;
		}
		case 6:{
			UpdateDepartment ud = new UpdateDepartment();
			ud.updateDept();
			adminOper();
			break;
		}
		case 7:{
			GetAllDepartments gad = new GetAllDepartments();
			gad.getAllDept();
			adminOper();
			break;
		}
		case 8:{
			GetAllLeaves gal = new GetAllLeaves();
			gal.getAllLeaves();
			adminOper();
			break;
		}
		case 9:{
			LeaveRespond lr = new LeaveRespond();
			lr.leaveRespond();
			adminOper();
			break;
		}
		case 10:{
			AdminOrEmployee.choice();
			break;
		}
		case 11:{
			return;
			
		}
		default:
			System.out.println("Please Press Valid Number");
			System.out.println("==========================");
			adminOper();
			break;
		}
		
		
		
		
		
		
	}
	
	
	

}
