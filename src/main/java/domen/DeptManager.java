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
@Table(name = "DEPT_MANAGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeptManager.findAll", query = "SELECT d FROM DeptManager d")
    , @NamedQuery(name = "DeptManager.findByDetpManagerNo", query = "SELECT d FROM DeptManager d WHERE d.detpManagerNo = :detpManagerNo")
    , @NamedQuery(name = "DeptManager.findByFromDate", query = "SELECT d FROM DeptManager d WHERE d.fromDate = :fromDate")
    , @NamedQuery(name = "DeptManager.findByToDate", query = "SELECT d FROM DeptManager d WHERE d.toDate = :toDate")})
public class DeptManager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DETP_MANAGER_NO")
    private Integer detpManagerNo;
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

    public DeptManager() {
    }

    public DeptManager(Integer detpManagerNo) {
        this.detpManagerNo = detpManagerNo;
    }

    public DeptManager(Integer detpManagerNo, Date fromDate, Date toDate) {
        this.detpManagerNo = detpManagerNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Integer getDetpManagerNo() {
        return detpManagerNo;
    }

    public void setDetpManagerNo(Integer detpManagerNo) {
        this.detpManagerNo = detpManagerNo;
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
        hash += (detpManagerNo != null ? detpManagerNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptManager)) {
            return false;
        }
        DeptManager other = (DeptManager) object;
        if ((this.detpManagerNo == null && other.detpManagerNo != null) || (this.detpManagerNo != null && !this.detpManagerNo.equals(other.detpManagerNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.DeptManager[ detpManagerNo=" + detpManagerNo + " ]";
    }
    
}
