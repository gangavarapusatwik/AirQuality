/**
 * GetDeviceAverageDataBetweenDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeviceAverageDataBetweenDateResponse  implements java.io.Serializable {
    private java.lang.String getDeviceAverageDataBetweenDateResult;

    public GetDeviceAverageDataBetweenDateResponse() {
    }

    public GetDeviceAverageDataBetweenDateResponse(
           java.lang.String getDeviceAverageDataBetweenDateResult) {
           this.getDeviceAverageDataBetweenDateResult = getDeviceAverageDataBetweenDateResult;
    }


    /**
     * Gets the getDeviceAverageDataBetweenDateResult value for this GetDeviceAverageDataBetweenDateResponse.
     * 
     * @return getDeviceAverageDataBetweenDateResult
     */
    public java.lang.String getGetDeviceAverageDataBetweenDateResult() {
        return getDeviceAverageDataBetweenDateResult;
    }


    /**
     * Sets the getDeviceAverageDataBetweenDateResult value for this GetDeviceAverageDataBetweenDateResponse.
     * 
     * @param getDeviceAverageDataBetweenDateResult
     */
    public void setGetDeviceAverageDataBetweenDateResult(java.lang.String getDeviceAverageDataBetweenDateResult) {
        this.getDeviceAverageDataBetweenDateResult = getDeviceAverageDataBetweenDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceAverageDataBetweenDateResponse)) return false;
        GetDeviceAverageDataBetweenDateResponse other = (GetDeviceAverageDataBetweenDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDeviceAverageDataBetweenDateResult==null && other.getGetDeviceAverageDataBetweenDateResult()==null) || 
             (this.getDeviceAverageDataBetweenDateResult!=null &&
              this.getDeviceAverageDataBetweenDateResult.equals(other.getGetDeviceAverageDataBetweenDateResult())));
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
        if (getGetDeviceAverageDataBetweenDateResult() != null) {
            _hashCode += getGetDeviceAverageDataBetweenDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeviceAverageDataBetweenDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeviceAverageDataBetweenDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDeviceAverageDataBetweenDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDeviceAverageDataBetweenDateResult"));
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
