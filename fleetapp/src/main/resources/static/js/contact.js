 
$('document').ready(function(){
	
$('table #editButton').on('click',function(event){
	event.preventDefault();
	
	// /countries/findById/?id=1
	var href = $(this).attr('href')
		$.get(href, function(contact, status){
			$('#txtEmailEdit').val(contact.email);
			$('#txtFirstnameEdit').val(contact.firstname);
			$('#txtIdEdit').val(contact.id);
			$('#txtLastnameEdit').val(contact.lastname);	
			$('#txtMobileEdit').val(contact.mobile);
			$('#txtPhoneEdit').val(contact.phone);			
			$('#txtRemarksEdit').val(contact.remarks);
		});
	$('#editModal').modal();
});	
	
  $('table #deleteButton').on('click',function(event){
	  event.preventDefault();
	 
	  var href = $(this).attr('href');
	  $('#confirmDeleteButton').attr('href', href);
	  
	  $('#deleteModal').modal();
	  
  });
  
});