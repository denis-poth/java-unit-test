@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	 assertEquals("Ожидалось, что пользователю 19 лет, поэтому checkIsAdult должен вернуть true", true, isAdult);
}
