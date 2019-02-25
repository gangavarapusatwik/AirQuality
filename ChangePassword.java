/**
 * ChangePassword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ChangePassword  implements java.io.Serializable {
    private int userId;

    private java.lang.String newPwd;

    private java.lang.String oldPwd;

    public ChangePassword() {
    }

    public ChangePassword(
           int userId,
           java.lang.String newPwd,
           java.lang.String oldPwd) {
           this.userId = userId;
           this.newPwd = newPwd;
           this.oldPwd = oldPwd;
    }


    /**
     * Gets the userId value for this ChangePassword.
     * 
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ChangePassword.
     * 
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * Gets the newPwd value for this ChangePassword.
     * 
     * @return newPwd
     */
    public java.lang.String getNewPwd() {
        return newPwd;
    }


    /**
     * Sets the newPwd value for this ChangePassword.
     * 
     * @param newPwd
     */
    public void setNewPwd(java.lang.String newPwd) {
        this.newPwd = newPwd;
    }


    /**
     * Gets the oldPwd value for this ChangePassword.
     * 
     * @return oldPwd
     */
    public java.lang.String getOldPwd() {
        return oldPwd;
    }


    /**
     * Sets the oldPwd value for this ChangePassword.
     * 
     * @param oldPwd
     */
    public void setOldPwd(java.lang.String oldPwd) {
        this.oldPwd = oldPwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePassword)) return false;
        ChangePassword other = (ChangePassword) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userId == other.getUserId() &&
            ((this.newPwd==null && other.getNewPwd()==null) || 
             (this.newPwd!=null &&
              this.newPwd.equals(other.getNewPwd()))) &&
            ((this.oldPwd==null && other.getOldPwd()==null) || 
             (this.oldPwd!=null &&
              this.oldPwd.equals(other.getOldPwd())));
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
        _hashCode += getUserId();
        if (getNewPwd() != null) {
            _hashCode += getNewPwd().hashCode();
        }
        if (getOldPwd() != null) {
            _hashCode += getOldPwd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePassword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangePassword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OldPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
