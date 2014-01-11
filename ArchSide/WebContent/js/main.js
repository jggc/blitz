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


Artiste = {
	"name" : "Nom",
	"origin" : "Origine",
	"active_start" : "Date de début",
	"active_end" : "Date de fin",
	"genres" : "Styles musicaux",
	"labels" : "Labels",
	"albums" : "Albums",
	"group_names" : "Noms de groupes",
	"intruments_played" : "Instruments joués"
}; 
Albums = {
	"name" : "Nom",
	"artists" : "Artistes",
	"release_date" : "Date de sortie",
	"genres" : "Styles musicaux",
	"track_names" : "Noms des pistes"
};	

function createTiles( array){
	
	for(var key in array){
		if( array.hasOwnProperty(key)){
			
			$cat = $(".templates .floatingTile").clone();
			$cat.find("h3").text(array[key]);
			
			$cat.appendTo(".categories");
		}
	}
}

$(function(){
	createTiles(Artiste);
	createTiles(Albums);
});
