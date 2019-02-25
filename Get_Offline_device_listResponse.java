/**
 * Get_Offline_device_listResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Offline_device_listResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Prakruti_Model.OfflineDevice_Result[] get_Offline_device_listResult;

    public Get_Offline_device_listResponse() {
    }

    public Get_Offline_device_listResponse(
           org.datacontract.schemas._2004._07.Prakruti_Model.OfflineDevice_Result[] get_Offline_device_listResult) {
           this.get_Offline_device_listResult = get_Offline_device_listResult;
    }


    /**
     * Gets the get_Offline_device_listResult value for this Get_Offline_device_listResponse.
     * 
     * @return get_Offline_device_listResult
     */
    public org.datacontract.schemas._2004._07.Prakruti_Model.OfflineDevice_Result[] getGet_Offline_device_listResult() {
        return get_Offline_device_listResult;
    }


    /**
     * Sets the get_Offline_device_listResult value for this Get_Offline_device_listResponse.
     * 
     * @param get_Offline_device_listResult
     */
    public void setGet_Offline_device_listResult(org.datacontract.schemas._2004._07.Prakruti_Model.OfflineDevice_Result[] get_Offline_device_listResult) {
        this.get_Offline_device_listResult = get_Offline_device_listResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Offline_device_listResponse)) return false;
        Get_Offline_device_listResponse other = (Get_Offline_device_listResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Offline_device_listResult==null && other.getGet_Offline_device_listResult()==null) || 
             (this.get_Offline_device_listResult!=null &&
              java.util.Arrays.equals(this.get_Offline_device_listResult, other.getGet_Offline_device_listResult())));
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
        if (getGet_Offline_device_listResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGet_Offline_device_listResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGet_Offline_device_listResult(), i);
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
        new org.apache.axis.description.TypeDesc(Get_Offline_device_listResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Offline_device_listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Offline_device_listResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Offline_device_listResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "OfflineDevice_Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "OfflineDevice_Result"));
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
