/**
 * Get_All_BlogsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_All_BlogsResponse  implements java.io.Serializable {
    private java.lang.String get_All_BlogsResult;

    public Get_All_BlogsResponse() {
    }

    public Get_All_BlogsResponse(
           java.lang.String get_All_BlogsResult) {
           this.get_All_BlogsResult = get_All_BlogsResult;
    }


    /**
     * Gets the get_All_BlogsResult value for this Get_All_BlogsResponse.
     * 
     * @return get_All_BlogsResult
     */
    public java.lang.String getGet_All_BlogsResult() {
        return get_All_BlogsResult;
    }


    /**
     * Sets the get_All_BlogsResult value for this Get_All_BlogsResponse.
     * 
     * @param get_All_BlogsResult
     */
    public void setGet_All_BlogsResult(java.lang.String get_All_BlogsResult) {
        this.get_All_BlogsResult = get_All_BlogsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_All_BlogsResponse)) return false;
        Get_All_BlogsResponse other = (Get_All_BlogsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_All_BlogsResult==null && other.getGet_All_BlogsResult()==null) || 
             (this.get_All_BlogsResult!=null &&
              this.get_All_BlogsResult.equals(other.getGet_All_BlogsResult())));
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
        if (getGet_All_BlogsResult() != null) {
            _hashCode += getGet_All_BlogsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_All_BlogsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_All_BlogsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_All_BlogsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_All_BlogsResult"));
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
