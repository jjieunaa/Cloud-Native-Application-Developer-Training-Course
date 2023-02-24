// studentscore.js

// 1. 학생데이터(student.json) 로딩 (ajax): Student 사용
// 2. 성적데이터(score.json) 로딩 (ajax): Score 사용
// 3. 성적 연산 (총점, 평균, 석차)
// 4. [데이터가져오기] 클릭 이벤트 처리

$.ajax({ //jquery ajax
    type:"post", //get방식으로 가져오기
    url:"json/student.json", //값을 가져올 경로
    success: function(data){   //요청 성공시 실행될 메서드
        console.log("data");
   }
});

$.ajax({ //jquery ajax
    type:"post", //get방식으로 가져오기
    url:"json/score.json", //값을 가져올 경로
    success: function(data){   //요청 성공시 실행될 메서드
        console.log("data");
   }
});