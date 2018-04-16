/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PCa
 */
@Entity
@Table(name = "DEPT_EMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeptEmp.findAll", query = "SELECT d FROM DeptEmp d")
    , @NamedQuery(name = "DeptEmp.findByDetpEmpNo", query = "SELECT d FROM DeptEmp d WHERE d.detpEmpNo = :detpEmpNo")
    , @NamedQuery(name = "DeptEmp.findByFromDate", query = "SELECT d FROM DeptEmp d WHERE d.fromDate = :fromDate")
    , @NamedQuery(name = "DeptEmp.findByToDate", query = "SELECT d FROM DeptEmp d WHERE d.toDate = :toDate")})
public class DeptEmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DETP_EMP_NO")
    private Integer detpEmpNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @JoinColumn(name = "DEPT_NO", referencedColumnName = "DEPT_NO")
    @ManyToOne(optional = false)
    private Departments deptNo;
    @JoinColumn(name = "EMP_NO", referencedColumnName = "EMP_NO")
    @ManyToOne(optional = false)
    private Employees empNo;

    public DeptEmp() {
    }

    public DeptEmp(Integer detpEmpNo) {
        this.detpEmpNo = detpEmpNo;
    }

    public DeptEmp(Integer detpEmpNo, Date fromDate, Date toDate) {
        this.detpEmpNo = detpEmpNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Integer getDetpEmpNo() {
        return detpEmpNo;
    }

    public void setDetpEmpNo(Integer detpEmpNo) {
        this.detpEmpNo = detpEmpNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Departments getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Departments deptNo) {
        this.deptNo = deptNo;
    }

    public Employees getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Employees empNo) {
        this.empNo = empNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detpEmpNo != null ? detpEmpNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptEmp)) {
            return false;
        }
        DeptEmp other = (DeptEmp) object;
        if ((this.detpEmpNo == null && other.detpEmpNo != null) || (this.detpEmpNo != null && !this.detpEmpNo.equals(other.detpEmpNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.DeptEmp[ detpEmpNo=" + detpEmpNo + " ]";
    }
    
}
