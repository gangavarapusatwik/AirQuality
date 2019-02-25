/**
 * IsAppVersonUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsAppVersonUpdate  implements java.io.Serializable {
    private java.lang.String verson;

    private java.lang.String appType;

    public IsAppVersonUpdate() {
    }

    public IsAppVersonUpdate(
           java.lang.String verson,
           java.lang.String appType) {
           this.verson = verson;
           this.appType = appType;
    }


    /**
     * Gets the verson value for this IsAppVersonUpdate.
     * 
     * @return verson
     */
    public java.lang.String getVerson() {
        return verson;
    }


    /**
     * Sets the verson value for this IsAppVersonUpdate.
     * 
     * @param verson
     */
    public void setVerson(java.lang.String verson) {
        this.verson = verson;
    }


    /**
     * Gets the appType value for this IsAppVersonUpdate.
     * 
     * @return appType
     */
    public java.lang.String getAppType() {
        return appType;
    }


    /**
     * Sets the appType value for this IsAppVersonUpdate.
     * 
     * @param appType
     */
    public void setAppType(java.lang.String appType) {
        this.appType = appType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsAppVersonUpdate)) return false;
        IsAppVersonUpdate other = (IsAppVersonUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.verson==null && other.getVerson()==null) || 
             (this.verson!=null &&
              this.verson.equals(other.getVerson()))) &&
            ((this.appType==null && other.getAppType()==null) || 
             (this.appType!=null &&
              this.appType.equals(other.getAppType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVerson() != null) {
            _hashCode += getVerson().hashCode();
        }
        if (getAppType() != null) {
            _hashCode += getAppType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsAppVersonUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsAppVersonUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Verson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AppType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
