/**
 * GetAllDeviceDataByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllDeviceDataByDateResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Prakruti_Model.Get_Device_Scan_Data_By_Date_Result[] getAllDeviceDataByDateResult;

    public GetAllDeviceDataByDateResponse() {
    }

    public GetAllDeviceDataByDateResponse(
           org.datacontract.schemas._2004._07.Prakruti_Model.Get_Device_Scan_Data_By_Date_Result[] getAllDeviceDataByDateResult) {
           this.getAllDeviceDataByDateResult = getAllDeviceDataByDateResult;
    }


    /**
     * Gets the getAllDeviceDataByDateResult value for this GetAllDeviceDataByDateResponse.
     * 
     * @return getAllDeviceDataByDateResult
     */
    public org.datacontract.schemas._2004._07.Prakruti_Model.Get_Device_Scan_Data_By_Date_Result[] getGetAllDeviceDataByDateResult() {
        return getAllDeviceDataByDateResult;
    }


    /**
     * Sets the getAllDeviceDataByDateResult value for this GetAllDeviceDataByDateResponse.
     * 
     * @param getAllDeviceDataByDateResult
     */
    public void setGetAllDeviceDataByDateResult(org.datacontract.schemas._2004._07.Prakruti_Model.Get_Device_Scan_Data_By_Date_Result[] getAllDeviceDataByDateResult) {
        this.getAllDeviceDataByDateResult = getAllDeviceDataByDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDeviceDataByDateResponse)) return false;
        GetAllDeviceDataByDateResponse other = (GetAllDeviceDataByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDeviceDataByDateResult==null && other.getGetAllDeviceDataByDateResult()==null) || 
             (this.getAllDeviceDataByDateResult!=null &&
              java.util.Arrays.equals(this.getAllDeviceDataByDateResult, other.getGetAllDeviceDataByDateResult())));
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
        if (getGetAllDeviceDataByDateResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllDeviceDataByDateResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllDeviceDataByDateResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllDeviceDataByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDeviceDataByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDeviceDataByDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDeviceDataByDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "Get_Device_Scan_Data_By_Date_Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Prakruti.Model", "Get_Device_Scan_Data_By_Date_Result"));
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
