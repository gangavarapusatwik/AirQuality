/**
 * Get_Installed_Device_CityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Installed_Device_CityResponse  implements java.io.Serializable {
    private java.lang.String get_Installed_Device_CityResult;

    public Get_Installed_Device_CityResponse() {
    }

    public Get_Installed_Device_CityResponse(
           java.lang.String get_Installed_Device_CityResult) {
           this.get_Installed_Device_CityResult = get_Installed_Device_CityResult;
    }


    /**
     * Gets the get_Installed_Device_CityResult value for this Get_Installed_Device_CityResponse.
     * 
     * @return get_Installed_Device_CityResult
     */
    public java.lang.String getGet_Installed_Device_CityResult() {
        return get_Installed_Device_CityResult;
    }


    /**
     * Sets the get_Installed_Device_CityResult value for this Get_Installed_Device_CityResponse.
     * 
     * @param get_Installed_Device_CityResult
     */
    public void setGet_Installed_Device_CityResult(java.lang.String get_Installed_Device_CityResult) {
        this.get_Installed_Device_CityResult = get_Installed_Device_CityResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Installed_Device_CityResponse)) return false;
        Get_Installed_Device_CityResponse other = (Get_Installed_Device_CityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Installed_Device_CityResult==null && other.getGet_Installed_Device_CityResult()==null) || 
             (this.get_Installed_Device_CityResult!=null &&
              this.get_Installed_Device_CityResult.equals(other.getGet_Installed_Device_CityResult())));
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
        if (getGet_Installed_Device_CityResult() != null) {
            _hashCode += getGet_Installed_Device_CityResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Installed_Device_CityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Installed_Device_CityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Installed_Device_CityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Installed_Device_CityResult"));
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
