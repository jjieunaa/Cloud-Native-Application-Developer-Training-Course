/*
Event.bubbles
이벤트가 DOM을 통해 버블링되는지 여부를 나타내는 부울 값입니다.

Event.cancelable
이벤트를 취소할 수 있는지 여부를 나타내는 부울 값입니다.

Event.composed
이벤트가 shadow DOM과 일반 DOM 사이의 경계를 넘어 버블링될 수 있는지 여부를 나타내는 부울입니다.

Event.currentTarget
이벤트에 대해 현재 등록된 대상에 대한 참조입니다. 이벤트가 현재 전송될 예정인 개체입니다. 이것은 리타게팅 을 통해 변경되었을 수 있습니다 .

Event.defaultPrevented
event.preventDefault()호출 이 이벤트를 취소 했는지 여부를 나타냅니다 .

Event.eventPhase
처리 중인 이벤트 흐름의 단계를 나타냅니다. 다음 숫자 중 하나입니다: NONE, CAPTURING_PHASE, AT_TARGET, BUBBLING_PHASE.

Event.isTrusted
이벤트가 브라우저(예: 사용자 클릭 후) 또는 스크립트(예: 이벤트 생성 방법 사용)에서 시작되었는지 여부를 나타냅니다.

Event.target
이벤트가 원래 전달된 개체에 대한 참조입니다.

Event.timeStamp
이벤트가 생성된 시간(밀리초)입니다. 사양에 따르면 이 값은 epoch 이후의 시간이지만 실제로는 브라우저의 정의가 다양합니다. DOMHighResTimeStamp또한 이를 대신 하는 작업이 진행 중 입니다.

Event.type
이벤트 유형을 식별하는 대소문자를 구분하지 않는 이름입니다.

Event.preventDefault()
이벤트를 취소합니다(취소 가능한 경우).

Event.stopPropagation()
DOM에서 더 나아가 이벤트 전파를 중지합니다.
*/

$(function() {
	
	$("#btn").click(function(e) {
		console.log("btn e.target ==> " +e.target);
		console.log("btn e.bubbles ==> " +e.bubbles);
		console.log("btn e.cancelable ==> " +e.cancelable);
		console.log("btn e.currentTarget ==> " +e.currentTarget);
		console.log("btn e.defaultPrevented ==> " +e.defaultPrevented);
		console.log("btn e.eventPhase ==> " +e.eventPhase);
		console.log("btn e.timeStamp ==> " +e.timeStamp);
		console.log("btn e.type ==> " +e.type);
		
		e.stopPropagation();
	});
	
	$("#inner").click(function(e) {
		console.log("inner e.target ==> " +e.target);
		console.log("inner e.bubbles ==> " +e.bubbles);
		console.log("inner e.cancelable ==> " +e.cancelable);
		console.log("inner e.currentTarget ==> " +e.currentTarget);
		console.log("inner e.defaultPrevented ==> " +e.defaultPrevented);
		console.log("inner e.eventPhase ==> " +e.eventPhase);
		console.log("inner e.timeStamp ==> " +e.timeStamp);
		console.log("inner e.type ==> " +e.type);
	});
	
	$("#wrapper").click(function(e) {
		console.log("wrapper e.target ==> " +e.target);
		console.log("wrapper e.bubbles ==> " +e.bubbles);
		console.log("wrapper e.cancelable ==> " +e.cancelable);
		console.log("wrapper e.currentTarget ==> " +e.currentTarget);
		console.log("wrapper e.defaultPrevented ==> " +e.defaultPrevented);
		console.log("wrapper e.eventPhase ==> " +e.eventPhase);
		console.log("wrapper e.timeStamp ==> " +e.timeStamp);
		console.log("wrapper e.type ==> " +e.type);
	});
	
	$("#alink").click(function(e) {
		e.preventDefault();
		location.href="http://google.com";
	});
	
})