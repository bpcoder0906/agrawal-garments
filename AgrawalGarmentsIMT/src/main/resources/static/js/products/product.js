/**
 * 
 */
(function($, window, document) {

	// The $ is now locally scoped

	// Listen for the jQuery ready event on the document
	$(function() {
		var url;
		function newProduct() {
			$('#dlg').dialog('open').dialog('setTitle', 'New Product');
			$('#fm').form('clear');
			url = 'productActions.html/add';
		}
		function editProduct() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$('#dlg').dialog('open').dialog('setTitle', 'Edit Product');
				$('#fm').form('load', row);
				url = 'productActions.html/update?id=' + row.id;
			}
		}
		function saveProduct() {

			if ($("#fm").form('validate')) {
				var dynamicData = {};

				dynamicData = JSON.stringify(ConvertFormToJSON($("#fm")));

				console.log(dynamicData);
				$.ajax({

					headers : {
						'Accept' : 'application/json',
						'Content-Type' : 'application/json'
					},
					url : url,
					type : "POST",
					data : dynamicData,
					success : function(res) {
						alert(res);

						$('#dlg').dialog('close'); // close the dialog
						$('#dg').datagrid('reload'); // reload the data
					}
				});

			} else {
				$.messager.show({
					title : 'Error',
					msg : "Please Enter Product details correctly!"
				});
			}

			function ConvertFormToJSON(form) {
				var array = jQuery(form).serializeArray();
				var json = {};

				jQuery.each(array, function() {
					json[this.name] = this.value || '';
				});

				return json;
			}

		}

		function destroyProduct() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager
						.confirm(
								'Confirm',
								'Are you sure you want to ddelte the Product?',
								function(r) {
									if (r) {

										$.ajax({

													headers : {
														'Accept' : 'application/json',
														'Content-Type' : 'application/json'
													},
													url : 'productActions.html/delete?id='
															+ row.id,
													type : 'POST',

													success : function(res) {
														alert(res);
														if (res == true) {
															$('#dlg').dialog(
																	'close'); // close
																				// the
															// dialog
															$('#dg').datagrid(
																	'reload'); // reload
															// the data
														} else {
															$.messager
																	.show({ // show
																			// error
																			// message
																		title : 'Error',
																		msg : "Error while updating product!"
																	});
														}

													}
												});
									}
								});
			}
		}

	});
}(window.jQuery, window, document));
// The global jQuery object is passed as a parameter
