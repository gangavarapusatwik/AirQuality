/**
 * GetLatestEntryDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetLatestEntryDateResponse  implements java.io.Serializable {
    private java.lang.String getLatestEntryDateResult;

    public GetLatestEntryDateResponse() {
    }

    public GetLatestEntryDateResponse(
           java.lang.String getLatestEntryDateResult) {
           this.getLatestEntryDateResult = getLatestEntryDateResult;
    }


    /**
     * Gets the getLatestEntryDateResult value for this GetLatestEntryDateResponse.
     * 
     * @return getLatestEntryDateResult
     */
    public java.lang.String getGetLatestEntryDateResult() {
        return getLatestEntryDateResult;
    }


    /**
     * Sets the getLatestEntryDateResult value for this GetLatestEntryDateResponse.
     * 
     * @param getLatestEntryDateResult
     */
    public void setGetLatestEntryDateResult(java.lang.String getLatestEntryDateResult) {
        this.getLatestEntryDateResult = getLatestEntryDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestEntryDateResponse)) return false;
        GetLatestEntryDateResponse other = (GetLatestEntryDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestEntryDateResult==null && other.getGetLatestEntryDateResult()==null) || 
             (this.getLatestEntryDateResult!=null &&
              this.getLatestEntryDateResult.equals(other.getGetLatestEntryDateResult())));
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
        if (getGetLatestEntryDateResult() != null) {
            _hashCode += getGetLatestEntryDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestEntryDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getLatestEntryDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestEntryDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getLatestEntryDateResult"));
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
