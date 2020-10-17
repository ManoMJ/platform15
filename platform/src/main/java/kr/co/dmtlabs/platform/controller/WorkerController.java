package kr.co.dmtlabs.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/worker/*")
public class WorkerController {
	@RequestMapping
	public String home() {
		return "worker/worker";
	}
	
	@RequestMapping(value ="JoinForm")
	public String JoinForm() {
		//������ �Է��Ͽ��� �̷¼��� �����ÿ� ��������
		//�̷¼��� ������� �����ߴ� ������Ʈ�� �̷¼��� �ڵ������� �߰����� ���� ����
		return "worker/JoinForm.jsp"
	}
	
	@RequestMapping(value ="MyPage")
	public String MyPage() {
		//�����ߴ� ������Ʈ ����
		//������Ʈ�� ���� ����� ����
		//���� ���� ������Ʈ�� �Ⱓ
		//�� ����
		//������Ʈ ���� ��� Ȯ��
		return "worker/MyPage.jsp"
	}
	
	@RequestMapping(value ="Person_Info")
	public String Person_Info() {
		//���� ��ÿ� �Է��Ͽ��� ���� ��������
		return "worker/Person_Info.jsp"
	}
	
	@RequestMapping(value ="Point_")
	public String Point_() {
		//�Ϸ�� ������Ʈ�� ����Ʈ ����
		//�Ϸ�� ������Ʈ�� ����Ʈ ���� ����
		return "worker/Point_.jsp"
	}
	
	@RequestMapping(value ="Project_Result")
	public String Project_Result() {
		//�ش� ������Ʈ�� ����� ����
		return "worker/Project_Result.jsp"
	}
	
}