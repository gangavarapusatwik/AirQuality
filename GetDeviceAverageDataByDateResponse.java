/**
 * GetDeviceAverageDataByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeviceAverageDataByDateResponse  implements java.io.Serializable {
    private java.lang.String getDeviceAverageDataByDateResult;

    public GetDeviceAverageDataByDateResponse() {
    }

    public GetDeviceAverageDataByDateResponse(
           java.lang.String getDeviceAverageDataByDateResult) {
           this.getDeviceAverageDataByDateResult = getDeviceAverageDataByDateResult;
    }


    /**
     * Gets the getDeviceAverageDataByDateResult value for this GetDeviceAverageDataByDateResponse.
     * 
     * @return getDeviceAverageDataByDateResult
     */
    public java.lang.String getGetDeviceAverageDataByDateResult() {
        return getDeviceAverageDataByDateResult;
    }


    /**
     * Sets the getDeviceAverageDataByDateResult value for this GetDeviceAverageDataByDateResponse.
     * 
     * @param getDeviceAverageDataByDateResult
     */
    public void setGetDeviceAverageDataByDateResult(java.lang.String getDeviceAverageDataByDateResult) {
        this.getDeviceAverageDataByDateResult = getDeviceAverageDataByDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceAverageDataByDateResponse)) return false;
        GetDeviceAverageDataByDateResponse other = (GetDeviceAverageDataByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDeviceAverageDataByDateResult==null && other.getGetDeviceAverageDataByDateResult()==null) || 
             (this.getDeviceAverageDataByDateResult!=null &&
              this.getDeviceAverageDataByDateResult.equals(other.getGetDeviceAverageDataByDateResult())));
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
        if (getGetDeviceAverageDataByDateResult() != null) {
            _hashCode += getGetDeviceAverageDataByDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeviceAverageDataByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeviceAverageDataByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDeviceAverageDataByDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDeviceAverageDataByDateResult"));
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
