package com.te.homeworkphoneSimultion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Contact implements Phone {
	String name;
	long number;
	String group;
	static List<Contact> al = new ArrayList<Contact>();
	static Scanner s = new Scanner(System.in);

	public Contact(String a, Long b, String c) {
		this.name = a;
		this.number = b;
		this.group = c;
	}

	@Override
	public void show_contact() {

		for (Contact contact : al) {
			System.out.println(contact);
		}
		test();
	}

	@Override
	public void search_contact() {
		
		System.out.println("enter the user name to search");
		
		String temp = s.next();
		List<Contact> collect = al.stream().filter((c) -> c.name.equals(temp)).collect(Collectors.toList());
		Contact contact = collect.get(0);

		System.out.println(contact.name + contact.group + contact.number);
		test();
	}

	private static void editcontact() {
		System.out.println("enter the name to edit contact");
		String f=s.next();
		List<Contact> collect = al.stream().filter((d)->d.name.equals(f)).collect(Collectors.toList());
          
Contact contact = collect.get(0);
if(al.contains(collect)) {
        	  System.out.println("enter \n 1->to change name \n 2-> to change number \n 3-> to change group");
        	  String e=s.next();
        	  switch (e) {
			case "1":
				System.out.println("enter the new name to modify");
				String changename=s.next();
				contact.name=changename;
				break;
			case "2":
				System.out.println("enter the new mobile no");
				long newnumber =s.nextLong();
				contact.number=newnumber;
				break;
			case "3":
				System.out.println("enter the new group name");
			String newgroup=s.next();
				contact.group=newgroup;
				break;
			default:
				System.out.println("enter the valid input");
				break;
			}
          }
	}

	private static void deletecontact() {
		System.out.println("enter the name to delete contact");
		String d = s.next();
		List<Contact> collect = al.stream().filter((s) -> s.name.equals(d)).collect(Collectors.toList());
		Contact contact = collect.get(0);

		al.remove(contact);
		test();
	}

	Contact() {

	}

	private static void addcontact() {

		System.out.println("enter the name");
		String a = s.next();
		System.out.println("enter the mobile no ");
		Long b = s.nextLong();
		System.out.println("enter group name");
		String c = s.next();

		Contact c1 = new Contact(a, b, c);
		al.add(c1);
		System.out.println("your data successfully added");
		Contact contact = new Contact();
		System.out.println("if you want to see contact press 1 \n or press 2 or search contact");
		int d = s.nextInt();
		if (d == 1)
			contact.show_contact();

		else {
			contact.search_contact();
		}

	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", group=" + group + "]";
	}

	public static void test() {
		Contact coc = new Contact();
		System.out.println(
				"select option to perform operation on contact \n 1:-show contact \n 2->search contact \n 3->delete contact \n 4->extra operation");
	
String no = s.next();
		switch (no) {
		case "1":
			coc.show_contact();
			break;
		case "2":
			coc.search_contact();
			break;
		case "3":
			coc.deletecontact();
			break;
		case "4":
			coc.oprate();
			break;
			default:
				System.out.println("enter valid input");
		}
		test();
	}

	@Override
	public void oprate() {

		System.out.println("enter \n 3->edit contact \n 4->to main menu");

	

		String d = s.next();
	
		switch (d) {

		case "2":
			deletecontact();
			break;
		case "3":
			editcontact();

		case "4":
			test();
			break;
		}

	}
}
