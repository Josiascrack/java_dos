/**
 * 
 */
 $(document).ready(function(){
	listar();
limpiar();
	
});

function listar(){
	$.get("ac", {"opc":1}, function(data){
		var x= JSON.parse(data);
		console.log(x);
		$("#tablita tbody tr").remove();
		for(var i=0;i<x.length;i++){
			$("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].idalum+"</td><td>"+x[i].nombre+"</td><td>"+x[i].telefono+"</td><td>"+x[i].direccion+"</td><td><a href='#' onclick='editar("+x[i].idalum+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].idalum+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
		}
	});
}
//registrar y editar rol
$("#boton2").click(function(){
	var idr = $("#id").val();
	if(idr==0){
		console.log("lleguemano");
	var nombre = $("#nombre").val()
	var telefono=$("#telefono").val()
	var direccion=$("#direccion").val()
	var param = {"nombre":nombre, "telefono":telefono, "direccion":direccion, "opc":2};
	$.ajax({
		
		
		data: param,
		url: 'ac',
		type: 'POST',
		success: function(response){
			alert(response);
			limpiar();
			listar();
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});
	}else{
		alert($("#id").val()+"/"+$("#nombre").val());
		var nombre = $("#nombre").val()
		var telefono=$("#telefono").val()
		var direccion=$("#direccion").val()
		var id=$("#id").val()
		
		$.post("ac",{"nombre":nombre, "telefono":telefono, "direccion":direccion,"idalum":id, "opc":4},function (data) {
		listar();
		limpiar();	
    });
	}
});

function editar(id){
	$("#boton2").html("Editar");
	$.get("ac",{"idalum":id,"opc":3},function (data) {
		var x = JSON.parse(data);
        $("#nombre").val(x.nombre)
         $("#telefono").val(x.telefono)
          $("#direccion").val(x.direccion)
        $("#id").val(x.idalum);
    });
}
function eliminar(id){
	$.get("ac",{"idalum":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	$("#nombre").val("");
	$("#telefono").val("");
	$("#direccion").val("");
	$("#id").val(0);
	$("#nombre").focus();
	$("#id").val(0);
	$("#boton2").html("Crear");
}
