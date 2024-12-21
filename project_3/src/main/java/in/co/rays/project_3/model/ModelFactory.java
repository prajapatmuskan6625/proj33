package in.co.rays.project_3.model;

import java.util.HashMap;
import java.util.ResourceBundle;

import in.co.rays.project_3.controller.CartOverviewModelInt;

/**
 * ModelFactory decides which model implementation run
 * 
 * @author Muskan Prajapat
 */
public final class ModelFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.project_3.bundle.system");
	private static final String DATABASE = rb.getString("DATABASE");

	private static ModelFactory mFactory = null;
	private static HashMap modelCache = new HashMap();

	private ModelFactory() {

	}

	public static ModelFactory getInstance() {
		if (mFactory == null) {
			mFactory = new ModelFactory();
		}
		return mFactory;
	}
	
	public InventoryModelInt getInventoryModel() {

		InventoryModelInt inventoryModel = (InventoryModelInt) modelCache.get("inventoryModel");
		if (inventoryModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				inventoryModel = new InventoryModelHibImp();
			}
			
			modelCache.put("inventoryModel", inventoryModel);
		}

		return inventoryModel;
	}
	
		

		
	
	public PortfolioManagementModelInt getPortfolioManagementModel() {		

		PortfolioManagementModelInt PortfolioManagement = (PortfolioManagementModelInt) modelCache.get("PortfolioManagement");
		if (PortfolioManagement == null) {
			if ("Hibernate".equals(DATABASE)) {
				PortfolioManagement = new PortfolioManagementModelHibImp();
			}
			
			
			modelCache.put("PortfolioManagement", PortfolioManagement);
		}

		return PortfolioManagement;
	}
	

	public MarksheetModelInt getMarksheetModel() {
		MarksheetModelInt marksheetModel = (MarksheetModelInt) modelCache.get("marksheetModel");
		if (marksheetModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				marksheetModel = new MarksheetModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				marksheetModel = new MarksheetModelJDBCImpl();
			}
			modelCache.put("marksheetModel", marksheetModel);
		}
		return marksheetModel;
	}

	public CollegeModelInt getCollegeModel() {
		CollegeModelInt collegeModel = (CollegeModelInt) modelCache.get("collegeModel");
		if (collegeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				collegeModel = new CollegeModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				collegeModel = new CollegeModelJDBCImpl();
			}
			modelCache.put("collegeModel", collegeModel);
		}
		return collegeModel;
	}

	public RoleModelInt getRoleModel() {
		RoleModelInt roleModel = (RoleModelInt) modelCache.get("roleModel");
		if (roleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				roleModel = new RoleModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				roleModel = new RoleModelJDBCImpl();
			}
			modelCache.put("roleModel", roleModel);
		}
		return roleModel;
	}

	public UserModelInt getUserModel() {

		UserModelInt userModel = (UserModelInt) modelCache.get("userModel");
		if (userModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				userModel = new UserModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				userModel = new UserModelJDBCImpl();
			}
			modelCache.put("userModel", userModel);
		}

		return userModel;
	}

	public StudentModelInt getStudentModel() {
		StudentModelInt studentModel = (StudentModelInt) modelCache.get("studentModel");
		if (studentModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				studentModel = new StudentModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				studentModel = new StudentModelJDBCImpl();
			}
			modelCache.put("studentModel", studentModel);
		}

		return studentModel;
	}

	public CourseModelInt getCourseModel() {
		CourseModelInt courseModel = (CourseModelInt) modelCache.get("courseModel");
		if (courseModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				courseModel = new CourseModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				courseModel = new CourseModelJDBCImpl();
			}
			modelCache.put("courseModel", courseModel);
		}

		return courseModel;
	}

	public TimetableModelInt getTimetableModel() {

		TimetableModelInt timetableModel = (TimetableModelInt) modelCache.get("timetableModel");

		if (timetableModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				timetableModel = new TimetableModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				timetableModel = new TimetableModelJDBCImpl();
			}
			modelCache.put("timetableModel", timetableModel);
		}

		return timetableModel;
	}

	public SubjectModelInt getSubjectModel() {
		SubjectModelInt subjectModel = (SubjectModelInt) modelCache.get("subjectModel");
		if (subjectModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				subjectModel = new SubjectModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				subjectModel = new SubjectModelJDBCImpl();
			}
			modelCache.put("subjectModel", subjectModel);
		}

		return subjectModel;
	}

	public FacultyModelInt getFacultyModel() {
		FacultyModelInt facultyModel = (FacultyModelInt) modelCache.get("facultyModel");
		if (facultyModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				facultyModel = new FacultyModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				facultyModel = new FacultyModelJDBCImpl();
			}
			modelCache.put("facultyModel", facultyModel);
		}

		return facultyModel;
	}

	public BankModelInt getBankModel() {

		BankModelInt bankModel = (BankModelInt) modelCache.get("bankModel");
		if (bankModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				bankModel = new BankModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("bankModel", bankModel);
		}

		return bankModel;
	}

	public EmployeeModelInt getEmployeeModel() {

		EmployeeModelInt EmployeeModel = (EmployeeModelInt) modelCache.get("EmployeeModel");
		if (EmployeeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				EmployeeModel = new EmployeeModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("EmployeeModel", EmployeeModel);
		}

		return EmployeeModel;
	}
	public OwnerModelInt getOwnerModel() {

		OwnerModelInt OwnerModel = (OwnerModelInt) modelCache.get("OwnerModel");
		if (OwnerModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				OwnerModel = new OwnerModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("OwnerModel",OwnerModel);
		}

		return OwnerModel;
	}
	
		
	public CustomerModelInt getCustomerModel() {		

		CustomerModelInt customerModel = (CustomerModelInt) modelCache.get("customerModel");
		if (customerModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				customerModel = new CustomerModelHibImp();
			}
			
			
			modelCache.put("customerModel", customerModel);
		}

		return customerModel;
	}

	public StockPurchaseModelInt getStockPurchaseModel() {
		 StockPurchaseModelInt stockPurchaseModel = (StockPurchaseModelInt) modelCache.get("stockPurchaseModel");
			if (stockPurchaseModel == null) {
				if ("Hibernate".equals(DATABASE)) {
					stockPurchaseModel = new StockPurchaseModelHibImp();
				}
				
				
				modelCache.put("stockPurchaseModel", stockPurchaseModel);
			}

			return stockPurchaseModel;

	}
	public TradeModelInt getTradeModel() {
		//UserModelInt userModel = null;
		TradeModelInt tradeModel = (TradeModelInt) modelCache.get("tradeModel");
		System.out.println(tradeModel);
		if (tradeModel == null) {
			
			if ("Hibernate".equals(DATABASE)) {
				tradeModel = new TradeModelHibImp();
			}
			System.out.println(DATABASE);
			modelCache.put("tradeModel", tradeModel);
		}

		return tradeModel;
	}
	
	
}
