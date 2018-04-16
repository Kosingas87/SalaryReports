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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PCa
 */
@Entity
@Table(name = "SALARIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salaries.findAll", query = "SELECT s FROM Salaries s")
    , @NamedQuery(name = "Salaries.findBySalariesNo", query = "SELECT s FROM Salaries s WHERE s.salariesNo = :salariesNo")
    , @NamedQuery(name = "Salaries.findBySalary", query = "SELECT s FROM Salaries s WHERE s.salary = :salary")
    , @NamedQuery(name = "Salaries.findByFromDate", query = "SELECT s FROM Salaries s WHERE s.fromDate = :fromDate")
    , @NamedQuery(name = "Salaries.findByToDate", query = "SELECT s FROM Salaries s WHERE s.toDate = :toDate")})
public class Salaries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SALARIES_NO")
    private Integer salariesNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SALARY")
    private String salary;
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
    @JoinColumn(name = "EMP_NO", referencedColumnName = "EMP_NO")
    @ManyToOne(optional = false)
    private Employees empNo;

    public Salaries() {
    }

    public Salaries(Integer salariesNo) {
        this.salariesNo = salariesNo;
    }

    public Salaries(Integer salariesNo, String salary, Date fromDate, Date toDate) {
        this.salariesNo = salariesNo;
        this.salary = salary;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Integer getSalariesNo() {
        return salariesNo;
    }

    public void setSalariesNo(Integer salariesNo) {
        this.salariesNo = salariesNo;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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

    public Employees getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Employees empNo) {
        this.empNo = empNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salariesNo != null ? salariesNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salaries)) {
            return false;
        }
        Salaries other = (Salaries) object;
        if ((this.salariesNo == null && other.salariesNo != null) || (this.salariesNo != null && !this.salariesNo.equals(other.salariesNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.Salaries[ salariesNo=" + salariesNo + " ]";
    }
    
}
