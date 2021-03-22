package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Product {

	private String model;			//모델
	private String manufacturer;	//제조사
	private String date;			//제조일
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {	//p1.equals(p1)이런식으로 주소값이 같으면 
			return true;	
		}if(obj instanceof Product){	//p1.equals(p2)
			Product p = (Product)obj;
			
			//모델과 제조사를 비교해서 동일하면 true반환, 아니면 false반환
			//p1.equals(p2)
			//p1의 모델: model(this.model)
			//p2의 모델: p.model
			if(model.equals(p.model) && manufacturer.equals(p.manufacturer)) {	//여기서의 equals는 String임
																				//equals앞에 model,manufacturer이 String타입이므로
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
