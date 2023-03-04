//服务层
app.service('brandService',function($http){
	var URL = "http://localhost:8801/shopping-manager/";
	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get(URL+'brand-Ms/queryAllBrand');		
	}
	//查询实体
	this.findOne=function(id){
		return $http.get(URL+'brand-Ms/findBrandDetail?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post(URL+'brand-Ms/addBrandAll',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post(URL+'brand-Ms/updateBrandAll',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get(URL+'brand-Ms/deleteBrandAll?ids='+ids);
	}

	//下拉列表数据
	this.selectOptionList=function(){
		return $http.get(URL+'brand-Ms/selectOptionList');
	}
	
});
