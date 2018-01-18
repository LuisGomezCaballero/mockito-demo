package com.luisgomezcaballero.mockitodemo;

public class ParentService {

	private ChildService childService;

	public ChildService getChildService() {
		return childService;
	}

	public void setChildService(ChildService childService) {
		this.childService = childService;
	}

	public int checkCorrectNumber(int myNumber) {

		if (childService.check123(myNumber) == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}
