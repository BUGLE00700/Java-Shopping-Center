//服务层
app.service('itemCatService',function($http){
	var URL = "http://localhost:8801/shopping-manager/";
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get(URL+'itemCat-ms/findAll');		
	}

	//查询实体
	this.findOne=function(id){
		return $http.get(URL+'itemCat-ms/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post(URL+'itemCat-ms/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post(URL+'itemCat-ms/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get(URL+'itemCat-ms/delete?ids='+ids);
	}
	
	
	this.findByParentId = function(parentId){
		return $http.get(URL+"itemCat-ms/findByParentId?parentId="+parentId);
	}
});
