
public class cpf {
	
	<script>

	var cpf = "169.169.000-75";
		cpf = "469.957.937-06";
	// Codigo relativo ao video 3	
				  
		function isCPF(cpf = 0){
			console.log(cpf);
			cpf  = cpf.replace(/\.|-/g,"");
			console.log(cpf);
			if(!validaPrimeiroDigito(cpf))
			   return false;
			if(!validaSegundoDigito(cpf))
			   return false;

			return true;
				
		}
		var sum = 0;
		
		function validaPrimeiroDigito(cpf = null){
			let fDigit = (sumFristDigit(cpf) * 10) % 11;
			 	fDigit = (fDigit == 10 || fDigit == 11 ) ? 0 : fDigit; 
			if(fDigit != cpf[9])
				return false
	    	return true;
		}
		function validaSegundoDigito(cpf = null){
			let sDigit = (sumSecondDigit(cpf) * 10) % 11;
		     	sDigit = (sDigit == 10 || sDigit == 11 ) ? 0 : sDigit;

			if(sDigit != cpf[10])
				return false
	    	return true;
		}


		sumFristDigit = function(cpf, position=0, sum=0){
			if(position > 9)
				return 0;
			return sum + sumFristDigit(cpf,position+1,cpf[position] * ((cpf.length-1)-position));
		}

		
		sumSecondDigit = function(cpf, position=0, sum=0){
			if(position > 10)
				return 0;
			return sum + sumSecondDigit(cpf,position+1,cpf[position] * ((cpf.length)-position));
		}

	console.log(isCPF(cpf));
	// Codigo relativo ao video 2
	/*function isCPF(cpf = 0){
		console.log(cpf );
		cpf  = cpf.replace(/\.|-/g,"");
		
		if(!validaPrimeiroDigito(cpf))
		   return false;
		if(!validaSegundoDigito(cpf))
		   return false;
		return true;
		
	}
	function validaPrimeiroDigito(cpf){
		let soma = 0;
		for (var i = 0; i < cpf.length-2 ; i++) {
			soma += cpf[i] * ((cpf.length-1)-i);
		}
		soma = (soma * 10) % 11;
		if(soma == 10 || soma == 11)
			soma = 0;
		console.log("pd : "+soma)
		if(soma != cpf[9])
			return false
		return true;
	}
	function validaSegundoDigito(cpf){
		let soma = 0;
		for (var i = 0; i < cpf.length-1 ; i++) {
			soma += cpf[i] * ((cpf.length)-i);
		}
		soma = (soma * 10) % 11;
		if(soma == 10 || soma == 11)
			soma = 0;
		console.log("sd : "+soma)
		if(soma != cpf[10])
			return false
		return true;
	}
	*/	
	/*	Codigo relativo ao video 2
	function isCPF(cpf = 0){
		console.log(cpf );
		cpf  = cpf.replace(/\.|-/g,"");
		let soma = 0;
		soma += cpf[0] * 10;
		soma += cpf[1] * 9;
		soma += cpf[2] * 8;
		soma += cpf[3] * 7;
		soma += cpf[4] * 6;
		soma += cpf[5] * 5;
		soma += cpf[6] * 4;
		soma += cpf[7] * 3;
		soma += cpf[8] * 2;
		soma = (soma * 10) % 11;
		if(soma == 10 || soma == 11)
			soma = 0;
		console.log("Primeiro d : "+soma);
		if(soma != cpf[9])
			return false;
		soma = 0;
		soma += cpf[0] * 11;
		soma += cpf[1] * 10;
		soma += cpf[2] * 9;
		soma += cpf[3] * 8;
		soma += cpf[4] * 7;
		soma += cpf[5] * 6;
		soma += cpf[6] * 5;
		soma += cpf[7] * 4;
		soma += cpf[8] * 3;
		soma += cpf[9] * 2;
		soma = (soma * 10) % 11;
		
		if(soma == 10 || soma == 11)
			soma = 0;
		if(soma != cpf[10])
			return false;
		
		console.log("segundo d : "+soma); 
		return true;
	}
	console.log(isCPF(cpf));*/
		
	</script>
}
