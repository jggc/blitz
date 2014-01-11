function request(value){
	$.ajax('frontend/query.jsp',{
				type : 'json',
				dataType : 'json',
				data : { 'val1' : value},
				
				success : function(data){
					console.log(data);
				},
				
				error : function(data){
					console.log("Erreur pendant la requête");
				}
			});
}