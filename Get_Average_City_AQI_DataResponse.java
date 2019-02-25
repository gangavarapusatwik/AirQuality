/**
 * Get_Average_City_AQI_DataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Average_City_AQI_DataResponse  implements java.io.Serializable {
    private java.lang.String get_Average_City_AQI_DataResult;

    public Get_Average_City_AQI_DataResponse() {
    }

    public Get_Average_City_AQI_DataResponse(
           java.lang.String get_Average_City_AQI_DataResult) {
           this.get_Average_City_AQI_DataResult = get_Average_City_AQI_DataResult;
    }


    /**
     * Gets the get_Average_City_AQI_DataResult value for this Get_Average_City_AQI_DataResponse.
     * 
     * @return get_Average_City_AQI_DataResult
     */
    public java.lang.String getGet_Average_City_AQI_DataResult() {
        return get_Average_City_AQI_DataResult;
    }


    /**
     * Sets the get_Average_City_AQI_DataResult value for this Get_Average_City_AQI_DataResponse.
     * 
     * @param get_Average_City_AQI_DataResult
     */
    public void setGet_Average_City_AQI_DataResult(java.lang.String get_Average_City_AQI_DataResult) {
        this.get_Average_City_AQI_DataResult = get_Average_City_AQI_DataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Average_City_AQI_DataResponse)) return false;
        Get_Average_City_AQI_DataResponse other = (Get_Average_City_AQI_DataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Average_City_AQI_DataResult==null && other.getGet_Average_City_AQI_DataResult()==null) || 
             (this.get_Average_City_AQI_DataResult!=null &&
              this.get_Average_City_AQI_DataResult.equals(other.getGet_Average_City_AQI_DataResult())));
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
        if (getGet_Average_City_AQI_DataResult() != null) {
            _hashCode += getGet_Average_City_AQI_DataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Average_City_AQI_DataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Average_City_AQI_DataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Average_City_AQI_DataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Average_City_AQI_DataResult"));
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
