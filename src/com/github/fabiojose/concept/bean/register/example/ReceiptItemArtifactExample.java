package com.github.fabiojose.concept.bean.register.example;

import java.util.HashMap;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.IExample;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.bean.good.ArtifactGood;
import com.github.fabiojose.concept.bean.good.example.ArtifactGoodExample;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;
import com.github.fabiojose.concept.bean.register.ReceiptItem;
import com.github.fabiojose.concept.visitor.register.FiscalItemTotalDiscountsVisitor;
import com.github.fabiojose.concept.visitor.register.FiscalItemTotalTaxesVisitor;
import com.github.fabiojose.concept.visitor.register.ItemRawValue;

public final class ReceiptItemArtifactExample implements IExample<ReceiptItem> {

	public static void main(String[] args) {
		
		final IExample<ReceiptItem> _example = new ReceiptItemArtifactExample();
		_example.example();
	}

	private IExample<ArtifactGood> artifact = new ArtifactGoodExample();
	private UnitFactory unit = UnitFactory.getInstance();
	
	@Override
	public ReceiptItem getInstance() {
		
		final ReceiptItem _result = new ReceiptItem();
		_result.setAdjustments(new HashMap<String, Unit>());
		_result.setDiscounts(new HashMap<String, Unit>());
		_result.getDiscounts().put("LOYALTY", unit.currency("BRL", 26D));
		_result.getDiscounts().put("PROMOTIONAL", unit.common("%", 5D));
		
		_result.setTaxes(new HashMap<String, Unit>());
		_result.getTaxes().put("BR.ICMS", unit.common("%", 25D));
		_result.getTaxes().put("BR.IPI", unit.common("%", 2.5D));
		
		_result.setDiscriminators(new HashMap<String, IPair<String,String>>());
		_result.setGood(artifact.getInstance());
		_result.setPrice(unit.currency("BRL", 369.44D));
		_result.setQuantity(unit.common("pc", 1D));
		
		return _result;
	}

	@Override
	public void example() {
		final ReceiptItem _item = getInstance();
		
		System.out.println(_item);
		
		final Visitor<IFiscalItem, Double> _ttaxes = new FiscalItemTotalTaxesVisitor();
		System.out.println("Total Taxes: " + _item.accept2(_ttaxes));
		
		final Visitor<IFiscalItem, Double> _tdiscounts = new FiscalItemTotalDiscountsVisitor();
		System.out.println("Total Discounts: " + _item.accept2(_tdiscounts));
		
		final Visitor<IItem, Double> _value = new ItemRawValue();
		System.out.println("Total Value: " + _item.accept2(_value));
		System.out.println("Net Total Value: " + (_item.accept2(_value) - _item.accept2(_tdiscounts) - _item.accept2(_ttaxes)));
	}

}
