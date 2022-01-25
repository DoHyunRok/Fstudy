<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	//board ajax
		function getboard(param) {
			var type = param;
			$
					.ajax({
						data : {
							"type" : type
						},
						url : "getboard.do",
						type : "post",
						success : function(data) {
							$("#bbs").empty();
							$("#index").empty();
							$("#h2").empty();
							var result = data;
							console.log(data);
							var str = '<tr><th>글 제목</th><th>등록일</th><th>조회수</th></tr><tbody id="bbsbody"><TR>';
							var h2 = type;
							$.each(result, function(i) {
								str += '<TD>' + result[i].title + '</TD><TD>'
										+ result[i].regdate + '</TD><TD>'
										+ result[i].cnt + '</TD>'
								str += '</TR>'
							});
							$("#bbs").append(str);
							$("#h2").append(h2);
							console.log(str);
						},
						error : function(jqXHR, textStatus, errorThrown) {
							alert("에러 발생");
						}
					})
		}
		function getsubboard(param) {
			var type = param;
			$
					.ajax({
						data : {
							"subtype" : type
						},
						url : "getsubboard.do",
						type : "post",
						success : function(data) {
							$("#bbs").empty();
							$("#index").empty();
							$("#h2").empty();
							var result = data;
							console.log(data);
							var str = '<tr><th>글 제목</th><th>등록일</th><th>조회수</th></tr><tbody id="bbsbody"><TR>';
							var h2 = type;
							$.each(result, function(i) {
								str += '<TD>' + result[i].title + '</TD><TD>'
										+ result[i].regdate + '</TD><TD>'
										+ result[i].cnt + '</TD>'
								str += '</TR>'
							});
							$("#bbs").append(str);
							$("#h2").append(h2);
							console.log(str);
						},
						error : function(jqXHR, textStatus, errorThrown) {
							alert("에러 발생");
						}
					})
		}
		//write null check
		function boardcheck() {
			var title = document.getElementById("title"); //제목
			var content = document.getElementById("bbs"); //내용
			if (title.value === "") {
				alert("제목을 입력해주세요");
				title.focus();
				return false;
			} else if (content.value === "") {
				alert("내용을 입력해주세요");
				content.focus();
				return false;
			} else {
				alert("글이 작성되었습니다.");
			}
		}
		//write subselect//
		function selectsub(data){
			console.log(data);
			var webc =["MVC1","MVC2","Spring","Mybatis"];
			var target= document.getElementById("categorysub")
			if(data.value =="Web") var subselect = webc;
			target.options.length =0;
			for (x in subselect){
				var opt = document.createElement("option");
				opt.value = subselect[x];
				opt.innerHTML = subselect[x];
				target.appendChild(opt);
			}
		}
	</script>
</body>
</html>