// var path = $("#path").val();
/**
 * 提示信息显示
 * element:显示提示信息的元素（font）
 * css：提示样式
 * tipString:提示信息
 * status：true/false --验证是否通过
 */
function validateTip(element,css,tipString,status){
	element.css(css);
	element.html(tipString);
	element.prev().children().attr("validateStatus",status);
}

function duibi(a, b) {
	var arr = a.split("-");
	var starttime = new Date(arr[0], arr[1], arr[2]);
	var starttimes = starttime.getTime();

	var arrs = b.split("-");
	var lktime = new Date(arrs[0], arrs[1], arrs[2]);
	var lktimes = lktime.getTime();

	if (starttimes >= lktimes) {

		alert('开始时间大于离开时间，请检查');
		return false;
	}
	else
		return true;
}
// var referer = $("#referer").val();