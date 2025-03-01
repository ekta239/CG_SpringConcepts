package com.example.springconcept.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
  public int eid;
  public String ename;

  @Autowired
    private DepartmentBean deptBean;
  public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
   @Autowired
   public EmployeeBean(DepartmentBean deptBean) {
      logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
      this.deptBean = deptBean;
   }

   public int getEid() {
      return eid;
   }
   public void setEid(int eid) {
      this.eid=eid;
   }
   public String getEname() {
      return ename;
   }
   public void setEname(String ename) {
      this.ename=ename;
   }
   public DepartmentBean getDeptBean() {
      return deptBean;
   }

   @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
      logger.info("*** Autowiring by using @Autowire annotation on setter ***");
      this.deptBean=deptBean;
   }

   public void showEmployeeDetails() {
      logger.info("Employee Id : {}", eid);
      logger.info("Employee Name : {}", ename);
      deptBean.setDeptName("Information Technology");
      logger.info("Department : {}", deptBean.getDeptName());
   }
}
