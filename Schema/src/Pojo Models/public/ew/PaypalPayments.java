package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PaypalPayments generated by hbm2java
 */
@Entity
@Table(name = "paypal_payments", schema = "public")
public class PaypalPayments implements java.io.Serializable {

	private PaypalPaymentsId id;

	public PaypalPayments() {
	}

	public PaypalPayments(PaypalPaymentsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "data", column = @Column(name = "data") ),
			@AttributeOverride(name = "hora", column = @Column(name = "hora") ),
			@AttributeOverride(name = "fusohorario", column = @Column(name = "fusohorario") ),
			@AttributeOverride(name = "nome", column = @Column(name = "nome") ),
			@AttributeOverride(name = "tipo", column = @Column(name = "tipo") ),
			@AttributeOverride(name = "status", column = @Column(name = "status") ),
			@AttributeOverride(name = "moeda", column = @Column(name = "moeda") ),
			@AttributeOverride(name = "valorbruto", column = @Column(name = "valorbruto") ),
			@AttributeOverride(name = "tarifa", column = @Column(name = "tarifa") ),
			@AttributeOverride(name = "liquido", column = @Column(name = "liquido") ),
			@AttributeOverride(name = "doeMail", column = @Column(name = "doe_mail") ),
			@AttributeOverride(name = "paraeMail", column = @Column(name = "parae_mail") ),
			@AttributeOverride(name = "iddatransacao", column = @Column(name = "iddatransacao") ),
			@AttributeOverride(name = "statusdoequivalente", column = @Column(name = "statusdoequivalente") ),
			@AttributeOverride(name = "statusdoendereco", column = @Column(name = "statusdoendereco") ),
			@AttributeOverride(name = "titulodoitem", column = @Column(name = "titulodoitem") ),
			@AttributeOverride(name = "iddoitem", column = @Column(name = "iddoitem") ),
			@AttributeOverride(name = "valordoenvioemanuseio", column = @Column(name = "valordoenvioemanuseio") ),
			@AttributeOverride(name = "valordoseguro", column = @Column(name = "valordoseguro") ),
			@AttributeOverride(name = "impostosobrevendas", column = @Column(name = "impostosobrevendas") ),
			@AttributeOverride(name = "opcao1nome", column = @Column(name = "opcao1nome") ),
			@AttributeOverride(name = "opcao1valor", column = @Column(name = "opcao1valor") ),
			@AttributeOverride(name = "opcao2nome", column = @Column(name = "opcao2nome") ),
			@AttributeOverride(name = "opcao2valor", column = @Column(name = "opcao2valor") ),
			@AttributeOverride(name = "sitedoleilao", column = @Column(name = "sitedoleilao") ),
			@AttributeOverride(name = "iddocomprador", column = @Column(name = "iddocomprador") ),
			@AttributeOverride(name = "urldoitem", column = @Column(name = "urldoitem") ),
			@AttributeOverride(name = "datadetermino", column = @Column(name = "datadetermino") ),
			@AttributeOverride(name = "iddaescritura", column = @Column(name = "iddaescritura") ),
			@AttributeOverride(name = "iddafatura", column = @Column(name = "iddafatura") ),
			@AttributeOverride(name = "idtxnDereferência", column = @Column(name = "idtxn_dereferência") ),
			@AttributeOverride(name = "numerodafatura", column = @Column(name = "numerodafatura") ),
			@AttributeOverride(name = "numeropersonalizado", column = @Column(name = "numeropersonalizado") ),
			@AttributeOverride(name = "iddorecibo", column = @Column(name = "iddorecibo") ),
			@AttributeOverride(name = "saldo", column = @Column(name = "saldo") ),
			@AttributeOverride(name = "enderecolinha1", column = @Column(name = "enderecolinha1") ),
			@AttributeOverride(name = "enderecolinha2DistritoBairro", column = @Column(name = "enderecolinha2_distrito_bairro") ),
			@AttributeOverride(name = "cidade", column = @Column(name = "cidade") ),
			@AttributeOverride(name = "estadoRegiaoTerritórioPrefeituraRepublica", column = @Column(name = "estado_regiao_território_prefeitura_republica") ),
			@AttributeOverride(name = "cep", column = @Column(name = "cep") ),
			@AttributeOverride(name = "pais", column = @Column(name = "pais") ),
			@AttributeOverride(name = "numerodotelefoneparacontato", column = @Column(name = "numerodotelefoneparacontato") ),
			@AttributeOverride(name = "extra", column = @Column(name = "extra") ) })
	public PaypalPaymentsId getId() {
		return this.id;
	}

	public void setId(PaypalPaymentsId id) {
		this.id = id;
	}

}