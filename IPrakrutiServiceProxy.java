package org.tempuri;

public class IPrakrutiServiceProxy implements org.tempuri.IPrakrutiService {
  private String _endpoint = null;
  private org.tempuri.IPrakrutiService iPrakrutiService = null;
  
  public IPrakrutiServiceProxy() {
    _initIPrakrutiServiceProxy();
  }
  
  public IPrakrutiServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIPrakrutiServiceProxy();
  }
  
  private void _initIPrakrutiServiceProxy() {
    try {
      iPrakrutiService = (new org.tempuri.PrakrutiServiceLocator()).getBasicHttpBinding_IPrakrutiService();
      if (iPrakrutiService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iPrakrutiService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iPrakrutiService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iPrakrutiService != null)
      ((javax.xml.rpc.Stub)iPrakrutiService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IPrakrutiService getIPrakrutiService() {
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService;
  }
  
  public void insertDeviceScanData(java.lang.String data) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.insertDeviceScanData(data);
  }
  
  public void insertDeviceScanDataNEW(java.lang.String data) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.insertDeviceScanDataNEW(data);
  }
  
  public void AQIHistory(java.lang.String DId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.AQIHistory(DId);
  }
  
  public void AQIHistoryOFOpenAQ() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.AQIHistoryOFOpenAQ();
  }
  
  public org.tempuri.LogInResponseLogInResult logIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.logIn(username, password);
  }
  
  public java.lang.String loginUser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.loginUser(username, password);
  }
  
  public org.datacontract.schemas._2004._07.Prakruti_Model.Device_Scan_Data[] getDeviceScanData(java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceScanData(deviceId);
  }
  
  public org.datacontract.schemas._2004._07.Prakruti_Model.Get_Device_Scan_Data_By_Date_Result[] getAllDeviceDataByDate(java.lang.String fromDate, java.lang.String toDate, java.lang.String deviceID, java.lang.String chartType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAllDeviceDataByDate(fromDate, toDate, deviceID, chartType);
  }
  
  public org.datacontract.schemas._2004._07.Prakruti_Model.MST_Device[] getAllDevices() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAllDevices();
  }
  
  public java.lang.String getLatestEntryDate() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getLatestEntryDate();
  }
  
  public java.lang.String get_Blog_Likes_By_BlogId(java.lang.String blogId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Blog_Likes_By_BlogId(blogId);
  }
  
  public java.lang.String submit_Blog_Commnet(java.lang.String blogPostId, java.lang.String blogComment, java.lang.String userId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.submit_Blog_Commnet(blogPostId, blogComment, userId);
  }
  
  public java.lang.String getAreaDevices(java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAreaDevices(dataType);
  }
  
  public org.datacontract.schemas._2004._07.Prakruti_Model.Get_City_Avg_Data_With_Colour_Result[] getAvgCityData(java.lang.Integer cityId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAvgCityData(cityId);
  }
  
  public java.lang.String getAvgDeviceData(java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAvgDeviceData(deviceId);
  }
  
  public java.lang.String getDeviceDataByDeviceId(java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceDataByDeviceId(deviceId);
  }
  
  public java.lang.String getDeviceAverageDataByMonth(java.lang.String currentDate, java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceAverageDataByMonth(currentDate, deviceId);
  }
  
  public java.lang.String getDeviceAverageDataByWeek(java.lang.String startDate, java.lang.Integer weekNumber, java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceAverageDataByWeek(startDate, weekNumber, deviceId);
  }
  
  public java.lang.String getDeviceAverageDataByDate(java.lang.String customDate, java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceAverageDataByDate(customDate, deviceId);
  }
  
  public java.lang.String masterGraph(java.lang.String fromDate, java.lang.String toDate, java.lang.String deviceID, java.lang.String chartType, java.lang.String androidID, java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.masterGraph(fromDate, toDate, deviceID, chartType, androidID, dataType);
  }
  
  public java.lang.String AQIMasterGraph(java.lang.String fromDate, java.lang.String toDate, java.lang.String deviceID) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.AQIMasterGraph(fromDate, toDate, deviceID);
  }
  
  public java.lang.String masterGraphOfOpenAQ(java.lang.String fromDate, java.lang.String toDate, java.lang.String deviceID, java.lang.String chartType, java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.masterGraphOfOpenAQ(fromDate, toDate, deviceID, chartType, dataType);
  }
  
  public java.lang.String getDeviceAverageDataBetweenDate(java.lang.String startDate, java.lang.String endDate, java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceAverageDataBetweenDate(startDate, endDate, deviceId);
  }
  
  public java.lang.String getDeviceLatestDataWithColor(java.lang.String deviceId, java.lang.String androidId, java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceLatestDataWithColor(deviceId, androidId, dataType);
  }
  
  public java.lang.String getDeviceLatestDataWithColorOfOpenAQ(java.lang.String deviceId, java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceLatestDataWithColorOfOpenAQ(deviceId, dataType);
  }
  
  public void updateIpAddress(java.lang.String ipAddress, java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.updateIpAddress(ipAddress, deviceId);
  }
  
  public java.lang.String getAirQualitySuggestions(java.lang.String AQI) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAirQualitySuggestions(AQI);
  }
  
  public java.lang.String get_Air_Pollution_Text() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Air_Pollution_Text();
  }
  
  public void insertDeviceErrorLog(java.lang.String deviceId, java.lang.String errorMessage, java.lang.String stackTrace, java.util.Calendar entryDate) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    iPrakrutiService.insertDeviceErrorLog(deviceId, errorMessage, stackTrace, entryDate);
  }
  
  public java.lang.String getDeviceInformation(java.lang.Integer companyId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceInformation(companyId);
  }
  
  public java.lang.Boolean insert_Device_Command(java.lang.String deviceId, java.lang.String command, java.lang.String response) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.insert_Device_Command(deviceId, command, response);
  }
  
  public java.lang.String get_All_Blogs() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_All_Blogs();
  }
  
  public java.lang.String get_Blog_By_Id(java.lang.String blogId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Blog_By_Id(blogId);
  }
  
  public java.lang.String get_Recent_Blog() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Recent_Blog();
  }
  
  public java.lang.String changePassword(int userId, java.lang.String newPwd, java.lang.String oldPwd) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.changePassword(userId, newPwd, oldPwd);
  }
  
  public java.lang.String registerUser(java.lang.String email, java.lang.String mobile, java.lang.String password, java.lang.String name, java.lang.String isVisitor, java.lang.String isuser) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.registerUser(email, mobile, password, name, isVisitor, isuser);
  }
  
  public java.lang.String addToList(java.lang.String androidID, java.lang.String deviceID, java.lang.String AQI, java.lang.String AQI_Color, java.lang.String AQL_Status, java.lang.String lastTime, java.lang.String deviceArea, java.lang.String action, java.lang.String sources) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.addToList(androidID, deviceID, AQI, AQI_Color, AQL_Status, lastTime, deviceArea, action, sources);
  }
  
  public java.lang.String get_List_Android_User_temp_Data(java.lang.String androidId, java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_List_Android_User_temp_Data(androidId, dataType);
  }
  
  public java.lang.String get_Push_Notification_Settings(java.lang.String androidId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Push_Notification_Settings(androidId);
  }
  
  public java.lang.String isDeviceExistOfUserTempDataList(java.lang.String deviceId, java.lang.String androidId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.isDeviceExistOfUserTempDataList(deviceId, androidId);
  }
  
  public java.lang.String getAllCountry() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAllCountry();
  }
  
  public java.lang.String getStateByCountryId(java.lang.Integer countryId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getStateByCountryId(countryId);
  }
  
  public java.lang.String geCityByStateId(java.lang.Integer stateId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.geCityByStateId(stateId);
  }
  
  public java.lang.String getDeviceList(java.lang.Integer companyId, java.lang.Integer startIndex) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceList(companyId, startIndex);
  }
  
  public java.lang.String getAllCompany() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getAllCompany();
  }
  
  public java.lang.String verifyDevice(java.lang.String macAddress) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.verifyDevice(macAddress);
  }
  
  public java.lang.String getDeviceById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getDeviceById(id);
  }
  
  public java.lang.String isRunNotificationAlert() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.isRunNotificationAlert();
  }
  
  public java.lang.String isDevcieEXIST(java.lang.String device_Id) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.isDevcieEXIST(device_Id);
  }
  
  public java.lang.String get_Installed_Device_Location(java.lang.String city_Id) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Installed_Device_Location(city_Id);
  }
  
  public java.lang.String get_Installed_Device_City() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Installed_Device_City();
  }
  
  public java.lang.String managePushNotificationSettings(java.lang.String userId, java.lang.String androidId, java.lang.String source, java.lang.String versions, java.lang.String city, java.lang.String city_Id, java.lang.String location, java.lang.String morningReport, java.lang.String eveningReport, java.lang.String trakingAlerts, java.lang.String tempValue, java.lang.String airPresValue, java.lang.String deviceId, java.lang.String outdoor, java.lang.String healthSensitive, java.lang.String children, java.lang.String outdoorActivity, java.lang.String mask, java.lang.String noneOfTheAbove, java.lang.String device_Token, java.lang.String aqiType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.managePushNotificationSettings(userId, androidId, source, versions, city, city_Id, location, morningReport, eveningReport, trakingAlerts, tempValue, airPresValue, deviceId, outdoor, healthSensitive, children, outdoorActivity, mask, noneOfTheAbove, device_Token, aqiType);
  }
  
  public java.lang.String morningAlertReport() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.morningAlertReport();
  }
  
  public java.lang.String socialRegisterUser(java.lang.String email, java.lang.String mobile, java.lang.String password, java.lang.String name, java.lang.String isVisitor, java.lang.String isuser, java.lang.String isLoginWith) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.socialRegisterUser(email, mobile, password, name, isVisitor, isuser, isLoginWith);
  }
  
  public java.lang.String forGotPassword(java.lang.String userEmail) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.forGotPassword(userEmail);
  }
  
  public java.lang.String openAQ() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.openAQ();
  }
  
  public java.lang.String openAQLocationWiseDeviceId() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.openAQLocationWiseDeviceId();
  }
  
  public java.lang.String getParameterlistOfOpenAQ(java.lang.String deviceId) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.getParameterlistOfOpenAQ(deviceId);
  }
  
  public java.lang.String get_Average_City_AQI_Data(java.lang.String dataType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Average_City_AQI_Data(dataType);
  }
  
  public java.lang.String emailVeryfication(java.lang.String userName, java.lang.String userEmail, java.lang.String password) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.emailVeryfication(userName, userEmail, password);
  }
  
  public java.lang.String isAppVersonUpdate(java.lang.String verson, java.lang.String appType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.isAppVersonUpdate(verson, appType);
  }
  
  public org.datacontract.schemas._2004._07.Prakruti_Model.OfflineDevice_Result[] get_Offline_device_list() throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.get_Offline_device_list();
  }
  
  public java.lang.String isDeviceStatusNotificationAlertRun(java.lang.String isRunType) throws java.rmi.RemoteException{
    if (iPrakrutiService == null)
      _initIPrakrutiServiceProxy();
    return iPrakrutiService.isDeviceStatusNotificationAlertRun(isRunType);
  }
  
  
}