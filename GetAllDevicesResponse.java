/**
 * GetAllDevicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllDevicesResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Prakruti_Model.MST_Device[] getAllDevicesResult;

    public GetAllDevicesResponse() {
    }

    public GetAllDevicesResponse(
           org.datacontract.schemas._2004._07.Prakruti_Model.MST_Device[] getAllDevicesResult) {
           this.getAllDevicesResult = getAllDevicesResult;
    }


    /**
     * Gets the getAllDevicesResult value for this GetAllDevicesResponse.
     * 
     * @return getAllDevicesResult
     */
    public org.datacontract.schemas._2004._07.Prakruti_Model.MST_Device[] getGetAllDevicesResult() {
        return getAllDevicesResult;
    }


    /**
     * Sets the getAllDevicesResult value for this GetAllDevicesResponse.
     * 
     * @param getAllDevicesResult
     */
    public void setGetAllDevicesResult(org.datacontract.schemas._2004._07.Prakruti_Model.MST_Device[] getAllDevicesResult) {
        this.getAllDevicesResult = getAllDevicesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDevicesResponse)) return false;
        GetAllDevicesResponse other = (GetAllDevicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDevicesResult==null && other.getGetAllDevicesResult()==null) || 
             (this.getAllDevicesResult!=null &&
              java.util.Arrays.equals(this.getAllDevicesResult, other.getGetAllDevicesResult())));
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
        if (getGetAllDevicesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllDevicesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllDevicesResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDevicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDevicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDevicesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDevicesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "MST_Device"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "MST_Device"));
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
