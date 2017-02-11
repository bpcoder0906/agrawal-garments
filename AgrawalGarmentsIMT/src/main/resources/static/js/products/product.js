/**
 * 
 */

// IIFE - Immediately Invoked Function Expression
(function($, window, document) {

	// The $ is now locally scoped

	// Listen for the jQuery ready event on the document
	$(function() {

		function userLogin(dynamicData) {

			return $.ajax({
				
				headers: {
			        'Accept': 'application/json',
			        'Content-Type': 'application/json'
				},
				url : "productActions.html/add",
				type : "POST",
				data :dynamicData
			});
		}

		var ele = $("#addproduct-btn");
		ele.on({ "click" : function() {
			console.log("product request***");
			var dynamicData={};

			dynamicData=JSON.stringify(ConvertFormToJSON($("#addProductForm")));
			
			console.log(dynamicData);

			var response = userLogin(dynamicData);

			response.done(function(data) {
				// Updates the UI based the ajax result
				
				if(data==true){
					//window.location.href = "/dashboard.html"; 
					alert("Product entered successfully!");
				}else{
					alert("Invalid Product Entry!");
				}
				
			});

			response.fail(function(data) {
				// Updates the UI based the ajax result
				alert(data);
			});

			}
		});
		
		function ConvertFormToJSON(form){
		    var array = jQuery(form).serializeArray();
		    var json = {};
		    
		    jQuery.each(array, function() {
		        json[this.name] = this.value || '';
		    });
		    
		    return json;
		}

	});

	// The rest of the code goes here!

}(window.jQuery, window, document));
// The global jQuery object is passed as a parameter
