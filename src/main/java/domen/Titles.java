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
@Table(name = "TITLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Titles.findAll", query = "SELECT t FROM Titles t")
    , @NamedQuery(name = "Titles.findByTitlesNo", query = "SELECT t FROM Titles t WHERE t.titlesNo = :titlesNo")
    , @NamedQuery(name = "Titles.findByTitle", query = "SELECT t FROM Titles t WHERE t.title = :title")
    , @NamedQuery(name = "Titles.findByFromDate", query = "SELECT t FROM Titles t WHERE t.fromDate = :fromDate")
    , @NamedQuery(name = "Titles.findByToDate", query = "SELECT t FROM Titles t WHERE t.toDate = :toDate")})
public class Titles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TITLES_NO")
    private Integer titlesNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @JoinColumn(name = "EMP_NO", referencedColumnName = "EMP_NO")
    @ManyToOne(optional = false)
    private Employees empNo;

    public Titles() {
    }

    public Titles(Integer titlesNo) {
        this.titlesNo = titlesNo;
    }

    public Titles(Integer titlesNo, String title, Date fromDate) {
        this.titlesNo = titlesNo;
        this.title = title;
        this.fromDate = fromDate;
    }

    public Integer getTitlesNo() {
        return titlesNo;
    }

    public void setTitlesNo(Integer titlesNo) {
        this.titlesNo = titlesNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        hash += (titlesNo != null ? titlesNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titles)) {
            return false;
        }
        Titles other = (Titles) object;
        if ((this.titlesNo == null && other.titlesNo != null) || (this.titlesNo != null && !this.titlesNo.equals(other.titlesNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domen.Titles[ titlesNo=" + titlesNo + " ]";
    }
    
}
