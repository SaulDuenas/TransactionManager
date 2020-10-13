//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.08 a las 02:42:37 PM CDT 
//


package com.configuration.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROPERTY" maxOccurs="1000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PROPERTY_PARENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SQLTYPE">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="VARCHAR"/>
 *                       &lt;enumeration value="LONGVARCHAR"/>
 *                       &lt;enumeration value="NUMERIC"/>
 *                       &lt;enumeration value="DECIMAL"/>
 *                       &lt;enumeration value="BIT"/>
 *                       &lt;enumeration value="TINYINT"/>
 *                       &lt;enumeration value="SMALLINT"/>
 *                       &lt;enumeration value="INTEGER"/>
 *                       &lt;enumeration value="BIGINT"/>
 *                       &lt;enumeration value="REAL"/>
 *                       &lt;enumeration value="FLOAT"/>
 *                       &lt;enumeration value="DOUBLE"/>
 *                       &lt;enumeration value="BINARY"/>
 *                       &lt;enumeration value="VARBINARY"/>
 *                       &lt;enumeration value="LONGVARBINARY"/>
 *                       &lt;enumeration value="DATE"/>
 *                       &lt;enumeration value="TIME"/>
 *                       &lt;enumeration value="TIMESTAMP"/>
 *                       &lt;enumeration value="N/A"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TYPE">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DIRECT"/>
 *                       &lt;enumeration value="SQLVALUE"/>
 *                       &lt;enumeration value="SYSTEM"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="DATASOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IS_MULTIVALUE">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="YES"/>
 *                       &lt;enumeration value="NO"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CONNECTION" maxOccurs="1000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="JNDINAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="USER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DRIVERCLASSNAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VALIDATION_QUERY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SOURCE" maxOccurs="1000">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="METADATA" maxOccurs="1000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="COLNAME_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ORDERID_SOURCE" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="COLNAME_LOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ORDERID_LOAD" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="SQLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARAMETER" maxOccurs="1000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ID_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="TYPE">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DIRECT"/>
 *                                 &lt;enumeration value="PROPERTY"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SQLTYPE">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="VARCHAR"/>
 *                                 &lt;enumeration value="LONGVARCHAR"/>
 *                                 &lt;enumeration value="NUMERIC"/>
 *                                 &lt;enumeration value="DECIMAL"/>
 *                                 &lt;enumeration value="BIT"/>
 *                                 &lt;enumeration value="TINYINT"/>
 *                                 &lt;enumeration value="SMALLINT"/>
 *                                 &lt;enumeration value="INTEGER"/>
 *                                 &lt;enumeration value="BIGINT"/>
 *                                 &lt;enumeration value="REAL"/>
 *                                 &lt;enumeration value="FLOAT"/>
 *                                 &lt;enumeration value="DOUBLE"/>
 *                                 &lt;enumeration value="BINARY"/>
 *                                 &lt;enumeration value="VARBINARY"/>
 *                                 &lt;enumeration value="LONGVARBINARY"/>
 *                                 &lt;enumeration value="DATE"/>
 *                                 &lt;enumeration value="TIME"/>
 *                                 &lt;enumeration value="TIMESTAMP"/>
 *                                 &lt;enumeration value="N/A"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="IS_MULTIVALUE">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="YES"/>
 *                                 &lt;enumeration value="NO"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TYPESOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CODINGFORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HEADER">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="N/A"/>
 *                       &lt;enumeration value="YES"/>
 *                       &lt;enumeration value="NO"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LEFT_ENCLOSURE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RIGHT_ENCLOUSURE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SHEET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="JRXMLPATH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DATASOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SQLSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DATALOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SQLLOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property",
    "connection",
    "source"
})
@XmlRootElement(name = "CONFIGURATION")
public class CONFIGURATION {

    @XmlElement(name = "PROPERTY")
    protected List<CONFIGURATION.PROPERTY> property;
    @XmlElement(name = "CONNECTION")
    protected List<CONFIGURATION.CONNECTION> connection;
    @XmlElement(name = "SOURCE", required = true)
    protected List<CONFIGURATION.SOURCE> source;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROPERTY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONFIGURATION.PROPERTY }
     * 
     * 
     */
    public List<CONFIGURATION.PROPERTY> getPROPERTY() {
        if (property == null) {
            property = new ArrayList<CONFIGURATION.PROPERTY>();
        }
        return this.property;
    }

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONNECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONFIGURATION.CONNECTION }
     * 
     * 
     */
    public List<CONFIGURATION.CONNECTION> getCONNECTION() {
        if (connection == null) {
            connection = new ArrayList<CONFIGURATION.CONNECTION>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONFIGURATION.SOURCE }
     * 
     * 
     */
    public List<CONFIGURATION.SOURCE> getSOURCE() {
        if (source == null) {
            source = new ArrayList<CONFIGURATION.SOURCE>();
        }
        return this.source;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="JNDINAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="USER" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DRIVERCLASSNAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VALIDATION_QUERY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONNECTION {

        @XmlAttribute(name = "NAME")
        protected String name;
        @XmlAttribute(name = "JNDINAME")
        protected String jndiname;
        @XmlAttribute(name = "URL")
        protected String url;
        @XmlAttribute(name = "USER")
        protected String user;
        @XmlAttribute(name = "PASSWORD")
        protected String password;
        @XmlAttribute(name = "DRIVERCLASSNAME")
        protected String driverclassname;
        @XmlAttribute(name = "VALIDATION_QUERY")
        protected String validationquery;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad jndiname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNDINAME() {
            return jndiname;
        }

        /**
         * Define el valor de la propiedad jndiname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNDINAME(String value) {
            this.jndiname = value;
        }

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Obtiene el valor de la propiedad user.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSER() {
            return user;
        }

        /**
         * Define el valor de la propiedad user.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSER(String value) {
            this.user = value;
        }

        /**
         * Obtiene el valor de la propiedad password.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSWORD() {
            return password;
        }

        /**
         * Define el valor de la propiedad password.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSWORD(String value) {
            this.password = value;
        }

        /**
         * Obtiene el valor de la propiedad driverclassname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRIVERCLASSNAME() {
            return driverclassname;
        }

        /**
         * Define el valor de la propiedad driverclassname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRIVERCLASSNAME(String value) {
            this.driverclassname = value;
        }

        /**
         * Obtiene el valor de la propiedad validationquery.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALIDATIONQUERY() {
            return validationquery;
        }

        /**
         * Define el valor de la propiedad validationquery.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALIDATIONQUERY(String value) {
            this.validationquery = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PROPERTY_PARENT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SQLTYPE">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="VARCHAR"/>
     *             &lt;enumeration value="LONGVARCHAR"/>
     *             &lt;enumeration value="NUMERIC"/>
     *             &lt;enumeration value="DECIMAL"/>
     *             &lt;enumeration value="BIT"/>
     *             &lt;enumeration value="TINYINT"/>
     *             &lt;enumeration value="SMALLINT"/>
     *             &lt;enumeration value="INTEGER"/>
     *             &lt;enumeration value="BIGINT"/>
     *             &lt;enumeration value="REAL"/>
     *             &lt;enumeration value="FLOAT"/>
     *             &lt;enumeration value="DOUBLE"/>
     *             &lt;enumeration value="BINARY"/>
     *             &lt;enumeration value="VARBINARY"/>
     *             &lt;enumeration value="LONGVARBINARY"/>
     *             &lt;enumeration value="DATE"/>
     *             &lt;enumeration value="TIME"/>
     *             &lt;enumeration value="TIMESTAMP"/>
     *             &lt;enumeration value="N/A"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TYPE">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DIRECT"/>
     *             &lt;enumeration value="SQLVALUE"/>
     *             &lt;enumeration value="SYSTEM"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="DATASOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IS_MULTIVALUE">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="YES"/>
     *             &lt;enumeration value="NO"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PROPERTY {

        @XmlAttribute(name = "PROPERTY")
        protected String property;
        @XmlAttribute(name = "PROPERTY_PARENT")
        protected String propertyparent;
        @XmlAttribute(name = "CATEGORY")
        protected String category;
        @XmlAttribute(name = "SQLTYPE")
        protected String sqltype;
        @XmlAttribute(name = "TYPE")
        protected String type;
        @XmlAttribute(name = "DATASOURCE")
        protected String datasource;
        @XmlAttribute(name = "IS_MULTIVALUE")
        protected String ismultivalue;
        @XmlAttribute(name = "VALUE")
        protected String value;
        @XmlAttribute(name = "FORMAT")
        protected String format;

        /**
         * Obtiene el valor de la propiedad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROPERTY() {
            return property;
        }

        /**
         * Define el valor de la propiedad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROPERTY(String value) {
            this.property = value;
        }

        /**
         * Obtiene el valor de la propiedad propertyparent.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROPERTYPARENT() {
            return propertyparent;
        }

        /**
         * Define el valor de la propiedad propertyparent.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROPERTYPARENT(String value) {
            this.propertyparent = value;
        }

        /**
         * Obtiene el valor de la propiedad category.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATEGORY() {
            return category;
        }

        /**
         * Define el valor de la propiedad category.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATEGORY(String value) {
            this.category = value;
        }

        /**
         * Obtiene el valor de la propiedad sqltype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSQLTYPE() {
            return sqltype;
        }

        /**
         * Define el valor de la propiedad sqltype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSQLTYPE(String value) {
            this.sqltype = value;
        }

        /**
         * Obtiene el valor de la propiedad type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Define el valor de la propiedad type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Obtiene el valor de la propiedad datasource.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATASOURCE() {
            return datasource;
        }

        /**
         * Define el valor de la propiedad datasource.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATASOURCE(String value) {
            this.datasource = value;
        }

        /**
         * Obtiene el valor de la propiedad ismultivalue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISMULTIVALUE() {
            return ismultivalue;
        }

        /**
         * Define el valor de la propiedad ismultivalue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISMULTIVALUE(String value) {
            this.ismultivalue = value;
        }

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALUE(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad format.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFORMAT() {
            return format;
        }

        /**
         * Define el valor de la propiedad format.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFORMAT(String value) {
            this.format = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="METADATA" maxOccurs="1000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="COLNAME_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ORDERID_SOURCE" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="COLNAME_LOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ORDERID_LOAD" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SQLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARAMETER" maxOccurs="1000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ID_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TYPE">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DIRECT"/>
     *                       &lt;enumeration value="PROPERTY"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SQLTYPE">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="VARCHAR"/>
     *                       &lt;enumeration value="LONGVARCHAR"/>
     *                       &lt;enumeration value="NUMERIC"/>
     *                       &lt;enumeration value="DECIMAL"/>
     *                       &lt;enumeration value="BIT"/>
     *                       &lt;enumeration value="TINYINT"/>
     *                       &lt;enumeration value="SMALLINT"/>
     *                       &lt;enumeration value="INTEGER"/>
     *                       &lt;enumeration value="BIGINT"/>
     *                       &lt;enumeration value="REAL"/>
     *                       &lt;enumeration value="FLOAT"/>
     *                       &lt;enumeration value="DOUBLE"/>
     *                       &lt;enumeration value="BINARY"/>
     *                       &lt;enumeration value="VARBINARY"/>
     *                       &lt;enumeration value="LONGVARBINARY"/>
     *                       &lt;enumeration value="DATE"/>
     *                       &lt;enumeration value="TIME"/>
     *                       &lt;enumeration value="TIMESTAMP"/>
     *                       &lt;enumeration value="N/A"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="IS_MULTIVALUE">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="YES"/>
     *                       &lt;enumeration value="NO"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GROUP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TYPESOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CODINGFORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HEADER">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="N/A"/>
     *             &lt;enumeration value="YES"/>
     *             &lt;enumeration value="NO"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LEFT_ENCLOSURE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RIGHT_ENCLOUSURE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SHEET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="JRXMLPATH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DATASOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SQLSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DATALOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SQLLOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "metadata",
        "parameter"
    })
    public static class SOURCE {

        @XmlElement(name = "METADATA")
        protected List<CONFIGURATION.SOURCE.METADATA> metadata;
        @XmlElement(name = "PARAMETER")
        protected List<CONFIGURATION.SOURCE.PARAMETER> parameter;
        @XmlAttribute(name = "NAME")
        protected String name;
        @XmlAttribute(name = "GROUP")
        protected String group;
        @XmlAttribute(name = "TYPESOURCE")
        protected String typesource;
        @XmlAttribute(name = "FILENAME")
        protected String filename;
        @XmlAttribute(name = "PATH")
        protected String path;
        @XmlAttribute(name = "CODINGFORMAT")
        protected String codingformat;
        @XmlAttribute(name = "HEADER")
        protected String header;
        @XmlAttribute(name = "DELIMITER")
        protected String delimiter;
        @XmlAttribute(name = "LEFT_ENCLOSURE")
        protected String leftenclosure;
        @XmlAttribute(name = "RIGHT_ENCLOUSURE")
        protected String rightenclousure;
        @XmlAttribute(name = "SHEET_NAME")
        protected String sheetname;
        @XmlAttribute(name = "JRXMLPATH")
        protected String jrxmlpath;
        @XmlAttribute(name = "DATASOURCE")
        protected String datasource;
        @XmlAttribute(name = "SQLSOURCE")
        protected String sqlsource;
        @XmlAttribute(name = "DATALOAD")
        protected String dataload;
        @XmlAttribute(name = "SQLLOAD")
        protected String sqlload;

        /**
         * Gets the value of the metadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the metadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMETADATA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONFIGURATION.SOURCE.METADATA }
         * 
         * 
         */
        public List<CONFIGURATION.SOURCE.METADATA> getMETADATA() {
            if (metadata == null) {
                metadata = new ArrayList<CONFIGURATION.SOURCE.METADATA>();
            }
            return this.metadata;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONFIGURATION.SOURCE.PARAMETER }
         * 
         * 
         */
        public List<CONFIGURATION.SOURCE.PARAMETER> getPARAMETER() {
            if (parameter == null) {
                parameter = new ArrayList<CONFIGURATION.SOURCE.PARAMETER>();
            }
            return this.parameter;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad group.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUP() {
            return group;
        }

        /**
         * Define el valor de la propiedad group.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUP(String value) {
            this.group = value;
        }

        /**
         * Obtiene el valor de la propiedad typesource.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPESOURCE() {
            return typesource;
        }

        /**
         * Define el valor de la propiedad typesource.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPESOURCE(String value) {
            this.typesource = value;
        }

        /**
         * Obtiene el valor de la propiedad filename.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFILENAME() {
            return filename;
        }

        /**
         * Define el valor de la propiedad filename.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFILENAME(String value) {
            this.filename = value;
        }

        /**
         * Obtiene el valor de la propiedad path.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPATH() {
            return path;
        }

        /**
         * Define el valor de la propiedad path.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPATH(String value) {
            this.path = value;
        }

        /**
         * Obtiene el valor de la propiedad codingformat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODINGFORMAT() {
            return codingformat;
        }

        /**
         * Define el valor de la propiedad codingformat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODINGFORMAT(String value) {
            this.codingformat = value;
        }

        /**
         * Obtiene el valor de la propiedad header.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHEADER() {
            return header;
        }

        /**
         * Define el valor de la propiedad header.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHEADER(String value) {
            this.header = value;
        }

        /**
         * Obtiene el valor de la propiedad delimiter.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDELIMITER() {
            return delimiter;
        }

        /**
         * Define el valor de la propiedad delimiter.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDELIMITER(String value) {
            this.delimiter = value;
        }

        /**
         * Obtiene el valor de la propiedad leftenclosure.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLEFTENCLOSURE() {
            return leftenclosure;
        }

        /**
         * Define el valor de la propiedad leftenclosure.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLEFTENCLOSURE(String value) {
            this.leftenclosure = value;
        }

        /**
         * Obtiene el valor de la propiedad rightenclousure.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRIGHTENCLOUSURE() {
            return rightenclousure;
        }

        /**
         * Define el valor de la propiedad rightenclousure.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRIGHTENCLOUSURE(String value) {
            this.rightenclousure = value;
        }

        /**
         * Obtiene el valor de la propiedad sheetname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHEETNAME() {
            return sheetname;
        }

        /**
         * Define el valor de la propiedad sheetname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHEETNAME(String value) {
            this.sheetname = value;
        }

        /**
         * Obtiene el valor de la propiedad jrxmlpath.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJRXMLPATH() {
            return jrxmlpath;
        }

        /**
         * Define el valor de la propiedad jrxmlpath.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJRXMLPATH(String value) {
            this.jrxmlpath = value;
        }

        /**
         * Obtiene el valor de la propiedad datasource.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATASOURCE() {
            return datasource;
        }

        /**
         * Define el valor de la propiedad datasource.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATASOURCE(String value) {
            this.datasource = value;
        }

        /**
         * Obtiene el valor de la propiedad sqlsource.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSQLSOURCE() {
            return sqlsource;
        }

        /**
         * Define el valor de la propiedad sqlsource.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSQLSOURCE(String value) {
            this.sqlsource = value;
        }

        /**
         * Obtiene el valor de la propiedad dataload.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATALOAD() {
            return dataload;
        }

        /**
         * Define el valor de la propiedad dataload.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATALOAD(String value) {
            this.dataload = value;
        }

        /**
         * Obtiene el valor de la propiedad sqlload.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSQLLOAD() {
            return sqlload;
        }

        /**
         * Define el valor de la propiedad sqlload.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSQLLOAD(String value) {
            this.sqlload = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="COLNAME_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ORDERID_SOURCE" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="COLNAME_LOAD" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ORDERID_LOAD" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SQLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class METADATA {

            @XmlAttribute(name = "NAME")
            protected String name;
            @XmlAttribute(name = "COLNAME_SOURCE")
            protected String colnamesource;
            @XmlAttribute(name = "ORDERID_SOURCE")
            protected Integer orderidsource;
            @XmlAttribute(name = "COLNAME_LOAD")
            protected String colnameload;
            @XmlAttribute(name = "ORDERID_LOAD")
            protected Integer orderidload;
            @XmlAttribute(name = "SQLTYPE")
            protected String sqltype;
            @XmlAttribute(name = "FORMAT")
            protected String format;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad colnamesource.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOLNAMESOURCE() {
                return colnamesource;
            }

            /**
             * Define el valor de la propiedad colnamesource.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOLNAMESOURCE(String value) {
                this.colnamesource = value;
            }

            /**
             * Obtiene el valor de la propiedad orderidsource.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getORDERIDSOURCE() {
                return orderidsource;
            }

            /**
             * Define el valor de la propiedad orderidsource.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setORDERIDSOURCE(Integer value) {
                this.orderidsource = value;
            }

            /**
             * Obtiene el valor de la propiedad colnameload.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOLNAMELOAD() {
                return colnameload;
            }

            /**
             * Define el valor de la propiedad colnameload.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOLNAMELOAD(String value) {
                this.colnameload = value;
            }

            /**
             * Obtiene el valor de la propiedad orderidload.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getORDERIDLOAD() {
                return orderidload;
            }

            /**
             * Define el valor de la propiedad orderidload.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setORDERIDLOAD(Integer value) {
                this.orderidload = value;
            }

            /**
             * Obtiene el valor de la propiedad sqltype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSQLTYPE() {
                return sqltype;
            }

            /**
             * Define el valor de la propiedad sqltype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSQLTYPE(String value) {
                this.sqltype = value;
            }

            /**
             * Obtiene el valor de la propiedad format.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMAT() {
                return format;
            }

            /**
             * Define el valor de la propiedad format.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMAT(String value) {
                this.format = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ID_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TYPE">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DIRECT"/>
         *             &lt;enumeration value="PROPERTY"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SQLTYPE">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="VARCHAR"/>
         *             &lt;enumeration value="LONGVARCHAR"/>
         *             &lt;enumeration value="NUMERIC"/>
         *             &lt;enumeration value="DECIMAL"/>
         *             &lt;enumeration value="BIT"/>
         *             &lt;enumeration value="TINYINT"/>
         *             &lt;enumeration value="SMALLINT"/>
         *             &lt;enumeration value="INTEGER"/>
         *             &lt;enumeration value="BIGINT"/>
         *             &lt;enumeration value="REAL"/>
         *             &lt;enumeration value="FLOAT"/>
         *             &lt;enumeration value="DOUBLE"/>
         *             &lt;enumeration value="BINARY"/>
         *             &lt;enumeration value="VARBINARY"/>
         *             &lt;enumeration value="LONGVARBINARY"/>
         *             &lt;enumeration value="DATE"/>
         *             &lt;enumeration value="TIME"/>
         *             &lt;enumeration value="TIMESTAMP"/>
         *             &lt;enumeration value="N/A"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="IS_MULTIVALUE">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="YES"/>
         *             &lt;enumeration value="NO"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PARAMETER {

            @XmlAttribute(name = "NAME")
            protected String name;
            @XmlAttribute(name = "PARAMETER")
            protected String parameter;
            @XmlAttribute(name = "ID_ORDER")
            protected Integer idorder;
            @XmlAttribute(name = "TYPE")
            protected String type;
            @XmlAttribute(name = "SQLTYPE")
            protected String sqltype;
            @XmlAttribute(name = "IS_MULTIVALUE")
            protected String ismultivalue;
            @XmlAttribute(name = "VALUE")
            protected String value;
            @XmlAttribute(name = "FORMAT")
            protected String format;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad parameter.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARAMETER() {
                return parameter;
            }

            /**
             * Define el valor de la propiedad parameter.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARAMETER(String value) {
                this.parameter = value;
            }

            /**
             * Obtiene el valor de la propiedad idorder.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIDORDER() {
                return idorder;
            }

            /**
             * Define el valor de la propiedad idorder.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIDORDER(Integer value) {
                this.idorder = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad sqltype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSQLTYPE() {
                return sqltype;
            }

            /**
             * Define el valor de la propiedad sqltype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSQLTYPE(String value) {
                this.sqltype = value;
            }

            /**
             * Obtiene el valor de la propiedad ismultivalue.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISMULTIVALUE() {
                return ismultivalue;
            }

            /**
             * Define el valor de la propiedad ismultivalue.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISMULTIVALUE(String value) {
                this.ismultivalue = value;
            }

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad format.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMAT() {
                return format;
            }

            /**
             * Define el valor de la propiedad format.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMAT(String value) {
                this.format = value;
            }

        }

    }

}
