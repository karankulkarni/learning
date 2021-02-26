import java.util.*;
public class mock {

	private static Scanner sc;
	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int empId = sc.nextInt();sc.nextLine();
			String empName = sc.nextLine();
			int mgrId = sc.nextInt();sc.nextLine();
			String deptName = sc.nextLine();
			double salary = sc.nextDouble();
			e[i] =new Employee(empId,empName,mgrId,deptName,salary);
		}
		double minSal = sc.nextDouble();
		double maxSal = sc.nextDouble();
		int count = findempsWithSalRange(e,minSal,maxSal);
		Employee maxi = getEmployeeWitMaxSal(e);
		if(count > 0) {
			System.out.println(count);
		}
		else {
			System.out.println("No Employees in the given range");
		}
		if(maxi != null) {
			System.out.println(maxi.getEmpId()+"#"+maxi.getDeptName()+"#"+maxi.getSalary());
		}
		

	}
	
	public static int findempsWithSalRange(Employee[] emps,double minSal,double maxSal){
	   //method logic
		int count = 0;
		for(int i=0;i<emps.length;i++) {
			if(emps[i].getSalary() < maxSal && emps[i].getSalary() > minSal) {
				count++;
			}
		}
		if(count > 0) {
			return count;
		}
		else {
			return 0;
		}
	}
	public static Employee getEmployeeWitMaxSal(Employee[] emps){
	   //method logic
		Employee maximum = null;
		double max = emps[0].getSalary();
		for(int i=0;i<emps.length;i++) {
			if(emps[i].getSalary() > max) {
				maximum = emps[i];
			}
		}
		return maximum;
	}

}

class Employee{
	int empId;
	String empName;
	int mgrId;
	String deptName;
	double salary;
	public Employee(int empId, String empName, int mgrId, String deptName, double salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.mgrId = mgrId;
		this.deptName = deptName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
