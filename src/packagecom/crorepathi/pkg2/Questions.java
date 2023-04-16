
package packagecom.crorepathi.pkg2;
import java.util.Scanner;
public class Questions {
  static String result;
 static Scanner sc= new Scanner(System.in);
 static int count_life_line=3;
 static int aud_phn=1;
 static int cnt_50_50 = 1;
 static int skip_cnt=1;
 
 public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}

 public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("1. Who is the Prime Minister of India");
		System.out.println("a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			Candidate.setAmount(25000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(25000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Narendra Modi \n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(25000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(25000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(25000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Narendra Modi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Narendra Modi\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(25000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(25000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(25000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(25000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(25000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(25000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Narendra Modi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Narendra Modi\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(25000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(25000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Narendra Modi\n" + "b) Jawaharlal Nehru\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(25000);
					return true;
				}
			}

		}


		return false;
	}

	  public static boolean fetchQuestion3(String name)throws Exception {
		  System.out.println("3. Which is the longest river in the world");
		  System.out.println("a) Nile River\n"+
		                     "b) Kaveri River\n"+
				             "c) Ganga River\n"+
		                     "d) Mansoon River\n"
				             +"e)Life line");
		  result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				Candidate.setAmount(50000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(5000);
							System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a)Nile River\n" + "d)Mansoon River \n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(50000);
										return true;
									} 
									else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(50000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Nile River\n"+
								                     "b) Kaveri River\n"+
										             "c) Ganga River\n"+
								                     "d) Mansoon River");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} 
							else if (result2.equalsIgnoreCase("c")) 
								{
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(50000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Nile River\n" + "d)Mansoon River \n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Nile River\n"+
								                     "b) Kaveri River\n"+
										             "c) Ganga River\n"+
								                     "d) Mansoon River");
													
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Nile River\n" + "d) Mansoon River\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(50000);
								return true;
							} 
							else {
								return false;
							}

						} 
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(5000);
									System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(50000);
										return true;
									} 
									else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result3.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(50000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Nile River\n"+
								                     "b) Kaveri River\n"+
										             "c) Ganga River\n"+
								                     "d) Mansoon River"
													);
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} 
							else if (result2.equalsIgnoreCase("c"))
								{
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(50000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("a")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(5000);
											System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Nile River\n"+
										                     "b) Kaveri River\n"+
												             "c) Ganga River\n"+
										                     "d) Mansoon River");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(50000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(50000);
										return true;
									} 
									else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Nile River\n" + "d) Mansoon River\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Nile River\n"+
										                     "b) Kaveri River\n"+
												             "c) Ganga River\n"+
										                     "d) Mansoon River");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} 
							else if (result3.equalsIgnoreCase("b"))//changed
								{
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Nile River\n" + "d) Mansoon River\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(50000);
										return true;
									} 
									else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(5000);
											System.out.println("option a = 95%\n" + "option b = 3%\n" + "option c = 1%\n" + "option d = 1%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Nile River\n"+
										                     "b) Kaveri River\n"+
												             "c) Ganga River\n"+
										                     "d) Mansoon River");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Nile River\n"+
				                     "b) Kaveri River\n"+
						             "c) Ganga River\n"+
				                     "d) Mansoon River");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(50000);
						return true;
					}
				}

			}


			return false;
		}
  public static boolean fetchQuestion4(String name)throws Exception {
	  System.out.println("4. Which IPL team has highest fallowers in India");
	  System.out.println("a) CSK\n"+
	                     "b) RCB\n"+
			             "c) KKR\n"+
	                     "d) MI\n"
			             +"e) Life line");
	  result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			Candidate.setAmount(100000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 0%\n" + "option b = 98%\n" + "option c = 1%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(100000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)RCB \n" + "d) MI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(100000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) CSK\n"+
							                     "b) RCB\n"+
									             "c) KKR\n"+
							                     "d) MI\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(100000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) RCB\n" + "d) MI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) CSK\n"+
							                     "b) RCB\n"+
									             "c) KKR\n"+
							                     "d) MI\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) RCB\n" + "d) MI\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(100000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 0%\n" + "option b = 98%\n" + "option c = 1%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(100000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(100000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) CSK\n"+
							                     "b) RCB\n"+
									             "c) KKR\n"+
							                     "d) MI\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(100000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 0%\n" + "option b = 98%\n" + "option c = 1%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) CSK\n"+
									                     "b) RCB\n"+
											             "c) KKR\n"+
									                     "d) MI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(100000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 0%\n" + "option b = 98%\n" + "option c = 1%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(100000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) RCB\n" + "d) MI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) CSK\n"+
									                     "b) RCB\n"+
											             "c) KKR\n"+
									                     "d) MI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) RCB\n" + "d) MI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(100000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 0%\n" + "option b = 98%\n" + "option c = 1%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) CSK\n"+
									                     "b) RCB\n"+
											             "c) KKR\n"+
									                     "d) MI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(100000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) CSK\n"+
			                     "b) RCB\n"+
					             "c) KKR\n"+
			                     "d) MI\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(100000);
					return true;
				}
			}

		}


		return false;
	}

  public static boolean fetchQuestion5(String name)throws Exception {
	  System.out.println("5.'Statue of Unity' located in which State");
	  System.out.println("a) Karnataka\n"+
	                     "b) Mumbai\n"+
			             "c) Gujarath\n"+
	                     "d) Punjab\n"
			             +"e) Life line");
	  result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(250000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 3%\n" + "option b = 9%\n" + "option c = 87%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(250000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Mumbai \n" + "c) Gujarath\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(250000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(250000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Karnataka\n"+
							                     "b) Mumbai\n"+
									             "c) Gujarath\n"+
							                     "d) Punjab\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(250000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Mumbai\n" + "c) Gujarath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Karnataka\n"+
							                     "b) Mumbai\n"+
									             "c) Gujarath\n"+
							                     "d) Punjab\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Mumbai\n" + "c) Gujarath\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(250000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 3%\n" + "option b = 9%\n" + "option c = 87%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(250000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(250000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Karnataka\n"+
							                     "b) Mumbai\n"+
									             "c) Gujarath\n"+
							                     "d) Punjab\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(250000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 3%\n" + "option b = 9%\n" + "option c = 87%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Karnataka\n"+
									                     "b) Mumbai\n"+
											             "c) Gujarath\n"+
									                     "d) Punjab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(250000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 3%\n" + "option b = 9%\n" + "option c = 87%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(250000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Mumbai \n" + "c) Gujarath\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Karnataka\n"+
									                     "b) Mumbai\n"+
											             "c) Gujarath\n"+
									                     "d) Punjab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Mumbai\n" + "c) Gujarath\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(250000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 3%\n" + "option b = 9%\n" + "option c = 87%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Karnataka\n"+
									                     "b) Mumbai\n"+
											             "c) Gujarath\n"+
									                     "d) Punjab\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(250000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Karnataka\n"+
			                     "b) Mumbai\n"+
					             "c) Gujarath\n"+
			                     "d) Punjab\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(250000);
					return true;
				}
			}

		}


		return false;
	}

  public static boolean fetchQuestion6(String name)throws Exception {
	  System.out.println("6.Name the National Reptile of India?");
	  System.out.println("a) Crocodile\n"+
	                     "b) Wolf\n"+
			             "c) Tiger\n"+
	                     "d) King Cobra\n"
			             +"e) Life Line");
	  result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(500000);
			return true;
		} 
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 1%\n" + "option d = 79%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(500000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Tiger \n" + "d)King Kobra \n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Crocodile\n"+
							                     "b) Wolf\n"+
									             "c) Tiger\n"+
							                     "d) King Cobra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c) Tiger\n" + "d) King Kobra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Crocodile\n"+
							                     "b) Wolf\n"+
									             "c) Tiger\n"+
							                     "d) King Cobra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Tiger \n" + "d) King Kobra\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(500000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 1%\n" + "option d = 79%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Crocodile\n"+
							                     "b) Wolf\n"+
									             "c) Tiger\n"+
							                     "d) King Cobra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 1%\n" + "option d = 79%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Crocodile\n"+
									                     "b) Wolf\n"+
											             "c) Tiger\n"+
									                     "d) King Cobra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(500000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 1%\n" + "option d = 79%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Tiger \n" + "d) King Kobra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Crocodile\n"+
									                     "b) Wolf\n"+
											             "c) Tiger\n"+
									                     "d) King Cobra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) Tiger\n" + "d) King Kobra\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 1%\n" + "option d = 79%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Crocodile\n"+
									                     "b) Wolf\n"+
											             "c) Tiger\n"+
									                     "d) King Cobra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Crocodile\n"+
			                     "b) Wolf\n"+
					             "c) Tiger\n"+
			                     "d) King Cobra\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(500000);
					return true;
				}
			}

		}


		return false;
	}

  public static boolean fetchQuestion7(String name)throws Exception {
	  System.out.println("7.Which Planet nearsest to the Earth?");
	  System.out.println("a) Jupiter\n"+
	                     "b) Pluto\n"+
			             "c) Mercury\n"+
	                     "d) Mars\n"
			             +"e)Life lIne");
	  result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(500000);
			return true;
		} 
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(1000000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) Mercury\n" + "d) Mars\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Jupiter\n"+
							                     "b) Pluto\n"+
									             "c) Mercury\n"+
							                     "d) Mars\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Mercury \n" + "d) Mars\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Jupiter\n"+
							                     "b) Pluto\n"+
									             "c) Mercury\n"+
							                     "d) Mars\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Mercury \n" + "d) Mars\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(1000000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Jupiter\n"+
							                     "b) Pluto\n"+
									             "c) Mercury\n"+
							                     "d) Mars\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Jupiter\n"+
									                     "b) Pluto\n"+
											             "c) Mercury\n"+
									                     "d) Mars\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Mercury\n" + "d) Mars\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Jupiter\n"+
									                     "b) Pluto\n"+
											             "c) Mercury\n"+
									                     "d) Mars\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Mercury\n" + "d) Mars\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Jupiter\n"+
									                     "b) Pluto\n"+
											             "c) Mercury\n"+
									                     "d) Mars\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Jupiter\n"+
			                     "b) Pluto\n"+
					             "c) Mercury\n"+
			                     "d) Mars\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(1000000);
					return true;
				}
			}

		}


		return false;
	}
  public static boolean fetchQuestion8(String name)throws Exception {
	  System.out.println("8. Name the National Heritage Animal of India");
	  System.out.println("a) Tiger\n"+
	                     "b) Lion\n"+
			             "c) Elephant\n"+
	                     "d) Zebra\n"
			             +"e) Life line");
	  result= sc.next();
	  if(result.equalsIgnoreCase("c")) {
		  Candidate.setAmount(2500000);
		  return true;
	  }
	  else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2500000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c) Elephant\n" + "d) Zebra\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Tiger\n"+
							                     "b) Lion\n"+
									             "c) Elephant\n"+
							                     "d) Zebra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Elephant \n" + "d) Zebra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Tiger\n"+
							                     "b) Lion\n"+
									             "c) Elephant\n"+
							                     "d) Zebra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("c)Elephantt \n" + "d) Zebra\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(2500000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Tiger\n"+
							                     "b) Lion\n"+
									             "c) Elephant\n"+
							                     "d) Zebra\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Tiger\n"+
									                     "b) Lion\n"+
											             "c) Elephant\n"+
									                     "d) Zebra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2500000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("c)Elephant\n" + "d) Zebra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Tiger\n"+
									                     "b) Lion\n"+
											             "c) Elephant\n"+
									                     "d) Zebra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("c)Elephant\n" + "d) Zebra\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(2500000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 12%\n" + "option b = 8%\n" + "option c = 79%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Tiger\n"+
									                     "b) Lion\n"+
											             "c) Elephant\n"+
									                     "d) Zebra\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Tiger\n"+
			                     "b) Lion\n"+
					             "c) Elephant\n"+
			                     "d) Zebra\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(2500000);
					return true;
				}
			}

		}


		return false;
	}
  public static boolean fetchQuestion9(String name)throws Exception {
	  System.out.println("9. Which is the deepest ocean in the world");
	  System.out.println("a) Indian Ocean\n"+
	                     "b) Pacific Ocean\n"+
			             "c) Arabic Sea\n"+
	                     "d) Mansoon Ocean\n"+
			             "e) Life line");
	  result= sc.next();
	  if(result.equalsIgnoreCase("b")) {
		  Candidate.setAmount(5000000);
		  return true;
	  }
	  else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(5000);
						System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(5000000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Pacific Ocean\n" + "d)Mansoon Ocean\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Indian Ocean\n"+
							                     "b) Pacific Ocean\n"+
									             "c) Arabic Sea\n"+
							                     "d) Mansoon Ocean\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c")) 
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Pacific Ocean \n" + "d) Mansoon Ocean\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Indian Ocean\n"+
							                     "b) Pacific Ocean\n"+
									             "c) Arabic Sea\n"+
							                     "d) Mansoon Ocean\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b)Pacific Ocean \n" + "d) Mansoon Ocean\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(5000000);
							return true;
						} 
						else {
							return false;
						}

					} 
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result3.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Indian Ocean\n"+
							                     "b) Pacific Ocean\n"+
									             "c) Arabic Sea\n"+
							                     "d) Mansoon Ocean\n"
												);
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result2.equalsIgnoreCase("c"))
							{
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Indian Ocean\n"+
									                     "b) Pacific Ocean\n"+
											             "c) Arabic Sea\n"+
									                     "d) Mansoon Ocean\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(5000);
								System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Pacific ocean\n" + "d) Mansoon Ocean\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Indian Ocean\n"+
									                     "b) Pacific Ocean\n"+
											             "c) Arabic Sea\n"+
									                     "d) Mansoon Ocean\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} 
						else if (result3.equalsIgnoreCase("b"))//changed
							{
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Pacific Ocean\n" + "d) Mansoon Ocean\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(5000000);
									return true;
								} 
								else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(5000);
										System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										} 
										else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Indian Ocean\n"+
									                     "b) Pacific Ocean\n"+
											             "c) Arabic Sea\n"+
									                     "d) Mansoon Ocean\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Indian Ocean\n"+
			                     "b) Pacific Ocean\n"+
					             "c) Arabic Sea\n"+
			                     "d) Mansoon Ocean\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(5000000);
					return true;
				}
			}

		}


		return false;
	}
			  public static boolean fetchQuestion10(String name)throws Exception {
				  System.out.println("10. Who is the executive head of the union Territories");
				  System.out.println("a) Prime Minister\n"+
				                     "b) President\n"+
						             "c) Vice-President\n"+
				                     "d) Chancellor\n"+
						             "e) Life line");
				  result= sc.next();
				  if(result.equalsIgnoreCase("b")) {
					  Candidate.setAmount(10000000);
					  return true;
				  }
				  else if (result.equalsIgnoreCase("e")) {
						if (count_life_line > 0) {
							count_life_line--;
							System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result2 = sc.next();
							if (result2.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(5000);
									System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50\n" + "c. skip");
									System.out.println("Select the life line:");
									String result3 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) President\n" + "d)Chancellor\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(10000000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
													+ "b. 50-50 -- (not available) \n" + "c. skip");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if(result4.equalsIgnoreCase("c")) {
												if(skip_cnt!=0) {
													Candidate.setAmount(10000000);
													return true;
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println("a) Prime Minister\n"+
										                     "b) President\n"+
												             "c) Vice-President\n"+
										                     "d) Chancellor\n"+
												             "e) Life line"
															);
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
											//--- need code intervention
										}
									} 
									else if (result2.equalsIgnoreCase("c")) 
										{
										if (skip_cnt != 0) {
											skip_cnt = 0;
											Candidate.setAmount(10000000);
											return true;
										}
										else {
											//
											System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
													+ "b. 50-50 \n" + "c. skip -- (not available)");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if (result3.equalsIgnoreCase("b")) {
												if (cnt_50_50 != 0) {
													cnt_50_50 = 0;
													System.out.println("Select the options");
													System.out.println("b)President \n" + "d) Chancellor\n");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													} 
													else {
														return false;
													}
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println("a) Prime Minister\n"+
										                     "b) President\n"+
												             "c) Vice-President\n"+
										                     "d) Chancellor\n"+
												             "e) Life line"
															);
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
										}
									}
								}
							}
							else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b)President \n" + "d) Chancellor\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(10000000);
										return true;
									} 
									else {
										return false;
									}

								} 
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result3 = sc.next();
									if (result3.equalsIgnoreCase("a")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(5000);
											System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(10000000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
													+ "b. 50-50 -- (not available) \n" + "c. skip");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if(result3.equalsIgnoreCase("c")) {
												if(skip_cnt!=0) {
													Candidate.setAmount(10000000);
													return true;
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println("a) Prime Minister\n"+
										                     "b) President\n"+
												             "c) Vice-President\n"+
										                     "d) Chancellor\n"+
												             "e) Life line"
															);
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
											//--- need code intervention
										}
									} 
									else if (result2.equalsIgnoreCase("c"))
										{
										if (skip_cnt != 0) {
											skip_cnt = 0;
											Candidate.setAmount(10000000);
											return true;
										}
										else {
											//
											System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
													+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if (result4.equalsIgnoreCase("a")) {
												if (aud_phn != 0) {
													aud_phn = 0;
													Thread.sleep(5000);
													System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
													System.out.println("Select the option");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else {
														return false;
													}
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println(
															"a) Prime Minister\n"+
												                     "b) President\n"+
														             "c) Vice-President\n"+
												                     "d) Chancellor\n"+
														             "e) Life line");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
										}
									}
								}
							}

							else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(10000000);
									return true;
								} else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result3 = sc.next();
									if (result3.equalsIgnoreCase("a")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(5000);
											System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(10000000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
													+ "b. 50-50  \n" + "c. skip -- (not available)");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if(result4.equalsIgnoreCase("b")) {
												if (cnt_50_50 != 0) {
													cnt_50_50 = 0;
													System.out.println("Select the options");
													System.out.println("b)President\n" + "d) Chancellor\n");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else {
														return false;
													}
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println(
															"a) Prime Minister\n"+
												                     "b) President\n"+
														             "c) Vice-President\n"+
												                     "d) Chancellor\n"+
														             "e) Life line");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
											//--- need code intervention
										}
									} 
									else if (result3.equalsIgnoreCase("b"))//changed
										{
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b)President\n" + "d) Chancellor\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(10000000);
												return true;
											} 
											else {
												return false;
											}
										}
										else {
											//
											System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
													+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
											System.out.println("Select the life line:");
											String result4 = sc.next();
											if (result3.equalsIgnoreCase("b")) {
												if (aud_phn != 0) {
													aud_phn = 0;
													Thread.sleep(5000);
													System.out.println("option a = 1%\n" + "option b = 89%\n" + "option c = 9%\n" + "option d = 1%");
													System.out.println("Select the option");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													} 
													else {
														return false;
													}
												}
												else {
													System.out.println("You have no life line left. Please select an option:");
													System.out.println(
															"a) Prime Minister\n"+
												                     "b) President\n"+
														             "c) Vice-President\n"+
												                     "d) Chancellor\n"+
														             "e) Life line");
													result = sc.next();
													if (result.equalsIgnoreCase("b")) {
														Candidate.setAmount(10000000);
														return true;
													}
													else
														return false;
												}
											}
										}
									}
								}
							}
						}
						//changes in line 122
						else {
							System.out.println("You have no life line left. Please select an option:");
							System.out.println(
									"a) Prime Minister\n"+
						                     "b) President\n"+
								             "c) Vice-President\n"+
						                     "d) Chancellor\n"+
								             "e) Life line");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(10000000);
								return true;
							}
						}

					}


					return false;
				}
		}