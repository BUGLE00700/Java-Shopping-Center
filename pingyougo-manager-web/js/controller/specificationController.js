 //控制层 
app.controller('specificationController' ,function($scope,$controller   ,specificationService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		specificationService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	$scope.findAll();
	
	
	//查询实体 
	$scope.findOne=function(id){				
		specificationService.findOne(id).success(
			function(response){
				$scope.entity= response;
		}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  	
					console.log($scope.entity);
		if($scope.entity.id!=null){//如果有ID
		// if($scope.entity.specification.id!=null){//如果有ID
			serviceObject=specificationService.update( $scope.entity ); //修改  
		}else{
			serviceObject=specificationService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		specificationService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}

	
	//$scope.entity={specificationOptionList:[]};
	
	//增加规格选项行
	$scope.addTableRow=function(){
		$scope.entity.specificationOptionList.push({});			
	}
	
	//删除规格选项行
	$scope.deleTableRow=function(index){
		$scope.entity.specificationOptionList.splice(index,1);
	}
    
});	
