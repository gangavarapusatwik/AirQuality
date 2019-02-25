/**
 * ForGotPasswordResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ForGotPasswordResponse  implements java.io.Serializable {
    private java.lang.String forGotPasswordResult;

    public ForGotPasswordResponse() {
    }

    public ForGotPasswordResponse(
           java.lang.String forGotPasswordResult) {
           this.forGotPasswordResult = forGotPasswordResult;
    }


    /**
     * Gets the forGotPasswordResult value for this ForGotPasswordResponse.
     * 
     * @return forGotPasswordResult
     */
    public java.lang.String getForGotPasswordResult() {
        return forGotPasswordResult;
    }


    /**
     * Sets the forGotPasswordResult value for this ForGotPasswordResponse.
     * 
     * @param forGotPasswordResult
     */
    public void setForGotPasswordResult(java.lang.String forGotPasswordResult) {
        this.forGotPasswordResult = forGotPasswordResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForGotPasswordResponse)) return false;
        ForGotPasswordResponse other = (ForGotPasswordResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forGotPasswordResult==null && other.getForGotPasswordResult()==null) || 
             (this.forGotPasswordResult!=null &&
              this.forGotPasswordResult.equals(other.getForGotPasswordResult())));
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
        if (getForGotPasswordResult() != null) {
            _hashCode += getForGotPasswordResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForGotPasswordResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ForGotPasswordResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forGotPasswordResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ForGotPasswordResult"));
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
