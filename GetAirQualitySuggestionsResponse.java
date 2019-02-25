/**
 * GetAirQualitySuggestionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAirQualitySuggestionsResponse  implements java.io.Serializable {
    private java.lang.String getAirQualitySuggestionsResult;

    public GetAirQualitySuggestionsResponse() {
    }

    public GetAirQualitySuggestionsResponse(
           java.lang.String getAirQualitySuggestionsResult) {
           this.getAirQualitySuggestionsResult = getAirQualitySuggestionsResult;
    }


    /**
     * Gets the getAirQualitySuggestionsResult value for this GetAirQualitySuggestionsResponse.
     * 
     * @return getAirQualitySuggestionsResult
     */
    public java.lang.String getGetAirQualitySuggestionsResult() {
        return getAirQualitySuggestionsResult;
    }


    /**
     * Sets the getAirQualitySuggestionsResult value for this GetAirQualitySuggestionsResponse.
     * 
     * @param getAirQualitySuggestionsResult
     */
    public void setGetAirQualitySuggestionsResult(java.lang.String getAirQualitySuggestionsResult) {
        this.getAirQualitySuggestionsResult = getAirQualitySuggestionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAirQualitySuggestionsResponse)) return false;
        GetAirQualitySuggestionsResponse other = (GetAirQualitySuggestionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAirQualitySuggestionsResult==null && other.getGetAirQualitySuggestionsResult()==null) || 
             (this.getAirQualitySuggestionsResult!=null &&
              this.getAirQualitySuggestionsResult.equals(other.getGetAirQualitySuggestionsResult())));
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
        if (getGetAirQualitySuggestionsResult() != null) {
            _hashCode += getGetAirQualitySuggestionsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAirQualitySuggestionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAirQualitySuggestionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAirQualitySuggestionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAirQualitySuggestionsResult"));
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
