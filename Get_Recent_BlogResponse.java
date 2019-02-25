/**
 * Get_Recent_BlogResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Recent_BlogResponse  implements java.io.Serializable {
    private java.lang.String get_Recent_BlogResult;

    public Get_Recent_BlogResponse() {
    }

    public Get_Recent_BlogResponse(
           java.lang.String get_Recent_BlogResult) {
           this.get_Recent_BlogResult = get_Recent_BlogResult;
    }


    /**
     * Gets the get_Recent_BlogResult value for this Get_Recent_BlogResponse.
     * 
     * @return get_Recent_BlogResult
     */
    public java.lang.String getGet_Recent_BlogResult() {
        return get_Recent_BlogResult;
    }


    /**
     * Sets the get_Recent_BlogResult value for this Get_Recent_BlogResponse.
     * 
     * @param get_Recent_BlogResult
     */
    public void setGet_Recent_BlogResult(java.lang.String get_Recent_BlogResult) {
        this.get_Recent_BlogResult = get_Recent_BlogResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Recent_BlogResponse)) return false;
        Get_Recent_BlogResponse other = (Get_Recent_BlogResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Recent_BlogResult==null && other.getGet_Recent_BlogResult()==null) || 
             (this.get_Recent_BlogResult!=null &&
              this.get_Recent_BlogResult.equals(other.getGet_Recent_BlogResult())));
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
        if (getGet_Recent_BlogResult() != null) {
            _hashCode += getGet_Recent_BlogResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Recent_BlogResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Recent_BlogResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Recent_BlogResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Recent_BlogResult"));
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
