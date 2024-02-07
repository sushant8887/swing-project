package com.operations;

import java.util.List;

public interface EmpOperations {

	void addEmp(Emp emp);

	void deleteEmp(Emp emp);

	void updateEmp(Emp emp);

	String[] searchEmp(Emp emp);

	 List<String[]> showEmp();

}
