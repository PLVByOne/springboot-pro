/**
 * report页面下拉框
 * author： PLV.com
 */
$(function(){
	$("#selectCityId").change(function(){
		var cityId = $("#selectCityId").val();
		var url = '/report/cityId/'+cityId;
		window.location.href = url;
	})
});