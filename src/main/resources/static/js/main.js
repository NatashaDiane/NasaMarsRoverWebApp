let roverButtons = document.querySelectorAll("button[id*='rover']")

roverButtons.forEach(button => button.addEventListener('click', function (){
	const buttonId = this.id
	const roverId = buttonId.split('rover')[1]
	let roverData = document.getElementById('marsRoverData')
	roverData.value = roverId
	document.getElementById('form').submit()
}))

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

let marsRoverName = document.getElementById('marsRoverData')
 buttonClickedRoverName(marsRoverName)
 

let marsSol = document.getElementById('marsSol').value
if (marsSol != null && marsSol != '' && marsSol >= 0) {
	document.getElementById('marsSol').value = marsSol
}

 function buttonClickedRoverName (roverName){
	 if (roverName == '')
		 roverName = 'Curiosity'
			 
	 document.getElementById('rover' + roverName).classList.remove('btn-secondary')
	 document.getElementById('rover' + roverName).classList.add('btn-primary')
 }
 

 
