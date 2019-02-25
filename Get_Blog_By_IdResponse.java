/**
 * Get_Blog_By_IdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Blog_By_IdResponse  implements java.io.Serializable {
    private java.lang.String get_Blog_By_IdResult;

    public Get_Blog_By_IdResponse() {
    }

    public Get_Blog_By_IdResponse(
           java.lang.String get_Blog_By_IdResult) {
           this.get_Blog_By_IdResult = get_Blog_By_IdResult;
    }


    /**
     * Gets the get_Blog_By_IdResult value for this Get_Blog_By_IdResponse.
     * 
     * @return get_Blog_By_IdResult
     */
    public java.lang.String getGet_Blog_By_IdResult() {
        return get_Blog_By_IdResult;
    }


    /**
     * Sets the get_Blog_By_IdResult value for this Get_Blog_By_IdResponse.
     * 
     * @param get_Blog_By_IdResult
     */
    public void setGet_Blog_By_IdResult(java.lang.String get_Blog_By_IdResult) {
        this.get_Blog_By_IdResult = get_Blog_By_IdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Blog_By_IdResponse)) return false;
        Get_Blog_By_IdResponse other = (Get_Blog_By_IdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Blog_By_IdResult==null && other.getGet_Blog_By_IdResult()==null) || 
             (this.get_Blog_By_IdResult!=null &&
              this.get_Blog_By_IdResult.equals(other.getGet_Blog_By_IdResult())));
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
        if (getGet_Blog_By_IdResult() != null) {
            _hashCode += getGet_Blog_By_IdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Blog_By_IdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Blog_By_IdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Blog_By_IdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Blog_By_IdResult"));
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
