//服务层
app.service('itemService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../item/findAll');		
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../item/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../item/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../item/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../item/delete?ids='+ids);
	}
	
});
