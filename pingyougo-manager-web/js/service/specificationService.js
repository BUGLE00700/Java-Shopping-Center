//服务层
app.service('specificationService',function($http){
	//网关
	var URL = "http://localhost:8801/shopping-manager/";
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get(URL+'specification-Ms/findSpecificationAll');		
	}
	//查询实体
	this.findOne=function(id){
		return $http.get(URL+'specification-Ms/findSpecificationAllOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post(URL+'specification-Ms/addSpecificationAll',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post(URL+'specification-Ms/updateSpecificationAll',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get(URL+'specification-Ms/deleteSpecificationAll?ids='+ids);
	}	
	//下拉列表
	this.selectOptionList=function(){
		return $http.get(URL+'specification-Ms/selectOptionList');
	}
	
});
