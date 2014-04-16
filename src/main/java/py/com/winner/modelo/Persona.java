package py.com.winner.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {

	private Integer idpersona;
	private String transactionid;
    private String identityno;
    private String idtype;
    private String idno;
    private String icno;
    private String surname;
    private String givenname;
    private String nationality;
    private Date dateofbirth;
    private String sex;
    private boolean donor;
    private String maritalstatus;
    private String placeofbirth;
    private String issuingauthority;
    private String ubicacion;
    private String workstationid;
    private String observations;
    private String portrait;
    private String signature;
    private String fingerprint1;
    private String fingerprint2;
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getIdentityno() {
		return identityno;
	}
	public void setIdentityno(String identityno) {
		this.identityno = identityno;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getIcno() {
		return icno;
	}
	public void setIcno(String icno) {
		this.icno = icno;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGivenname() {
		return givenname;
	}
	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isDonor() {
		return donor;
	}
	public void setDonor(boolean donor) {
		this.donor = donor;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public String getIssuingauthority() {
		return issuingauthority;
	}
	public void setIssuingauthority(String issuingauthority) {
		this.issuingauthority = issuingauthority;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getWorkstationid() {
		return workstationid;
	}
	public void setWorkstationid(String workstationid) {
		this.workstationid = workstationid;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getFingerprint1() {
		return fingerprint1;
	}
	public void setFingerprint1(String fingerprint1) {
		this.fingerprint1 = fingerprint1;
	}
	public String getFingerprint2() {
		return fingerprint2;
	}
	public void setFingerprint2(String fingerprint2) {
		this.fingerprint2 = fingerprint2;
	}
      
}
